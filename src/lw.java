import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lw {
   private final clx a;
   private final clx b;
   private final clx c;
   private final lq d;
   private final cis e;
   private final ae.a f = ae.a.b();
   private final cmc<?> g;

   public lw(cmc<?> $$0, clx $$1, clx $$2, clx $$3, lq $$4, cis $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static lw a(clx $$0, clx $$1, clx $$2, lq $$3, cis $$4) {
      return new lw(cmc.u, $$0, $$1, $$2, $$3, $$4);
   }

   public lw a(String $$0, am $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public void a(Consumer<lo> $$0, String $$1) {
      this.a($$0, new aer($$1));
   }

   public void a(Consumer<lo> $$0, aer $$1) {
      this.a($$1);
      this.f.a(lp.a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lw.a($$1, this.g, this.a, this.b, this.c, this.e, this.f, $$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(aer $$0) {
      if (this.f.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aer a, cmc<?> b, clx c, clx d, clx e, cis f, ae.a g, aer h) implements lo {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.c());
         $$0.add("base", this.d.c());
         $$0.add("addition", this.e.c());
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("item", jb.i.b(this.f).toString());
         $$0.add("result", $$1);
      }

      @Override
      public aer b() {
         return this.a;
      }

      @Override
      public cmc<?> c() {
         return this.b;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.g.c();
      }

      @Nullable
      @Override
      public aer e() {
         return this.h;
      }

      public aer f() {
         return this.a;
      }

      public cmc<?> g() {
         return this.b;
      }

      public clx h() {
         return this.c;
      }

      public clx i() {
         return this.d;
      }

      public clx j() {
         return this.e;
      }

      public cis k() {
         return this.f;
      }

      public ae.a l() {
         return this.g;
      }

      public aer m() {
         return this.h;
      }
   }
}
