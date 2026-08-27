import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ly {
   private final lr a;
   private final clw b;
   private final clw c;
   private final clw d;
   private final ae.a e = ae.a.b();
   private final cmb<?> f;

   public ly(cmb<?> $$0, lr $$1, clw $$2, clw $$3, clw $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static ly a(clw $$0, clw $$1, clw $$2, lr $$3) {
      return new ly(cmb.v, $$3, $$0, $$1, $$2);
   }

   public ly a(String $$0, am $$1) {
      this.e.a($$0, $$1);
      return this;
   }

   public void a(Consumer<lp> $$0, aep $$1) {
      this.a($$1);
      this.e.a(lq.a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new ly.a($$1, this.f, this.b, this.c, this.d, this.e, $$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(aep $$0) {
      if (this.e.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aep a, cmb<?> b, clw c, clw d, clw e, ae.a f, aep g) implements lp {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.c());
         $$0.add("base", this.d.c());
         $$0.add("addition", this.e.c());
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
         return this.f.c();
      }

      @Nullable
      @Override
      public aep e() {
         return this.g;
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

      public ae.a k() {
         return this.f;
      }

      public aep l() {
         return this.g;
      }
   }
}
