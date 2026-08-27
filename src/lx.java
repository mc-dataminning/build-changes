import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lx {
   private final clw a;
   private final clw b;
   private final clw c;
   private final lr d;
   private final cir e;
   private final ae.a f = ae.a.b();
   private final cmb<?> g;

   public lx(cmb<?> $$0, clw $$1, clw $$2, clw $$3, lr $$4, cir $$5) {
      this.d = $$4;
      this.g = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.e = $$5;
   }

   public static lx a(clw $$0, clw $$1, clw $$2, lr $$3, cir $$4) {
      return new lx(cmb.u, $$0, $$1, $$2, $$3, $$4);
   }

   public lx a(String $$0, am $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public void a(Consumer<lp> $$0, String $$1) {
      this.a($$0, new aep($$1));
   }

   public void a(Consumer<lp> $$0, aep $$1) {
      this.a($$1);
      this.f.a(lq.a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lx.a($$1, this.g, this.a, this.b, this.c, this.e, this.f, $$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(aep $$0) {
      if (this.f.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aep a, cmb<?> b, clw c, clw d, clw e, cir f, ae.a g, aep h) implements lp {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.c());
         $$0.add("base", this.d.c());
         $$0.add("addition", this.e.c());
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("item", jc.i.b(this.f).toString());
         $$0.add("result", $$1);
      }

      @Override
      public aep b() {
         return this.a;
      }

      @Override
      public cmb<?> c() {
         return this.b;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.g.c();
      }

      @Nullable
      @Override
      public aep e() {
         return this.h;
      }

      public aep f() {
         return this.a;
      }

      public cmb<?> g() {
         return this.b;
      }

      public clw h() {
         return this.c;
      }

      public clw i() {
         return this.d;
      }

      public clw j() {
         return this.e;
      }

      public cir k() {
         return this.f;
      }

      public ae.a l() {
         return this.g;
      }

      public aep m() {
         return this.h;
      }
   }
}
