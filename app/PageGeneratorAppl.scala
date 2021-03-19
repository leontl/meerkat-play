package meerkat

import io.circe.Json
import ada.products.PageGenerator
import ada.enhancements._
import io.circe.generic.auto._, io.circe.syntax._

object PageGeneratorAppl{
    val food1 = "public/images/headers/food1.jpeg"
    val food2 = "public/images/headers/food2.jpeg"
    val gadget1 = "public/images/headers/gadget1.jpeg"
    val gadget2 = "public/images/headers/gadget2.jpeg"
    val pet1 = "public/images/headers/pet1.jpeg"
    val pet2 = "public/images/headers/pet2.jpeg"
    val trees1 = "public/images/headers/tree1.jpeg"
    val trees2 = "public/images/headers/tree2.jpeg"
    val neighbourhood1 = "public/images/headers/neighbourhood1.jpeg"
    val neighbourhood2 = "public/images/headers/neighbourhood2.jpeg"
    val friends1 = "public/images/headers/friends1.jpeg"
    val friends2 = "public/images/headers/friends2.jpeg"

    case class Article(id: Int, headline: String, image: String)
    val h1 = List(List(Article(0, "99 Recipes for Lockdown", food1), Article(0, "Don't Move - Stay Healthy", food1) ),
                    List(Article(1, "Do I Really Need This Gadget?", gadget1), Article(1, "Second Hand Tech is Now In Vogue", gadget1)),
                    List(Article(2, "What is Your Pet Like", pet1), Article(2, "Pet Antics", pet1)),
                    List(Article(3, "Should We Hug Trees More", trees1), Article(3, "The Benefits of Trees for Mental Health", trees1)),
                    List(Article(4, "6 Things to Discover in your Neighbourhood", neighbourhood1), Article(4, "Local Exploration is Catching On", neighbourhood1)),
                    List(Article(5, "How to Maintain Your Friendships during Lockdown", friends1), Article(5, "Staying Friends in the Remote Era",friends1))).zipWithIndex.map{case(k, v) => (v,k)}.toMap
    
    val pageGenerator = new PageGenerator[Article](6, h1)(
        i => Json.fromString(i.toString()),
        io.circe.Decoder[Int],
        io.circe.Encoder[Article],
        io.circe.Decoder[Article])
}