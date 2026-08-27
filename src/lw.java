import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lw {
   private final ciz a;
   private final ciz b;
   private final ciz c;
   private final lq d;
   private final cfu e;
   private final ae.a f = ae.a.b();
   private final cje<?> g;

   public lw(cje<?> $$0, ciz $$1, ciz $$2, ciz $$3, lq $$4, cfu $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static lw a(ciz $$0, ciz $$1, ciz $$2, lq $$3, cfu $$4) {
      return new lw(cje.u, $$0, $$1, $$2, $$3, $$4);
   }

   public lw a(String $$0, am $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public void a(Consumer<lo> $$0, String $$1) {
      this.a($$0, new acq($$1));
   }

   public void a(Consumer<lo> $$0, acq $$1) {
      this.a($$1);
      this.f.a(lp.a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lw.a($$1, this.g, this.a, this.b, this.c, this.e, this.f, $$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(acq $$0) {
      if (this.f.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(acq a, cje<?> b, ciz c, ciz d, ciz e, cfu f, ae.a g, acq h) implements lo {
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
      public acq b() {
         return this.a;
      }

      @Override
      public cje<?> c() {
         return this.b;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.g.c();
      }

      @Nullable
      @Override
      public acq e() {
         return this.h;
      }

      public acq f() {
         return this.a;
      }

      public cje<?> g() {
         return this.b;
      }

      public ciz h() {
         return this.c;
      }

      public ciz i() {
         return this.d;
      }

      public ciz j() {
         return this.e;
      }

      public cfu k() {
         return this.f;
      }

      public ae.a l() {
         return this.g;
      }

      public acq m() {
         return this.h;
      }
   }
}
