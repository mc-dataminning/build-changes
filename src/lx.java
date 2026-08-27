import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lx {
   private final lq a;
   private final cly b;
   private final cly c;
   private final cly d;
   private final ae.a e = ae.a.b();
   private final cmd<?> f;

   public lx(cmd<?> $$0, lq $$1, cly $$2, cly $$3, cly $$4) {
      this.a = $$1;
      this.f = $$0;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public static lx a(cly $$0, cly $$1, cly $$2, lq $$3) {
      return new lx(cmd.v, $$3, $$0, $$1, $$2);
   }

   public lx a(String $$0, am $$1) {
      this.e.a($$0, $$1);
      return this;
   }

   public void a(Consumer<lo> $$0, aer $$1) {
      this.a($$1);
      this.e.a(lp.a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lx.a($$1, this.f, this.b, this.c, this.d, this.e, $$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(aer $$0) {
      if (this.e.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static record a(aer a, cmd<?> b, cly c, cly d, cly e, ae.a f, aer g) implements lo {
      @Override
      public void a(JsonObject $$0) {
         $$0.add("template", this.c.c());
         $$0.add("base", this.d.c());
         $$0.add("addition", this.e.c());
      }

      @Override
      public aer b() {
         return this.a;
      }

      @Override
      public cmd<?> c() {
         return this.b;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.f.c();
      }

      @Nullable
      @Override
      public aer e() {
         return this.g;
      }

      public aer f() {
         return this.a;
      }

      public cmd<?> g() {
         return this.b;
      }

      public cly h() {
         return this.c;
      }

      public cly i() {
         return this.d;
      }

      public cly j() {
         return this.e;
      }

      public ae.a k() {
         return this.f;
      }

      public aer l() {
         return this.g;
      }
   }
}
