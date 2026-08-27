import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lv implements lp {
   private final lq b;
   private final cfu c;
   private final ciz d;
   private final int e;
   private final ae.a f = ae.a.b();
   @Nullable
   private String g;
   private final cje<?> h;

   public lv(lq $$0, cje<?> $$1, ciz $$2, cml $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static lv a(ciz $$0, lq $$1, cml $$2) {
      return new lv($$1, cje.t, $$0, $$2, 1);
   }

   public static lv a(ciz $$0, lq $$1, cml $$2, int $$3) {
      return new lv($$1, cje.t, $$0, $$2, $$3);
   }

   public lv b(String $$0, am $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public lv b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cfu a() {
      return this.c;
   }

   @Override
   public void a(Consumer<lo> $$0, acq $$1) {
      this.a($$1);
      this.f.a(a).a("has_the_recipe", cs.a($$1)).a(ah.a.c($$1)).a(ap.b);
      $$0.accept(new lv.a($$1, this.h, this.g == null ? "" : this.g, this.d, this.c, this.e, this.f, $$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(acq $$0) {
      if (this.f.d().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a implements lo {
      private final acq a;
      private final String b;
      private final ciz c;
      private final cfu d;
      private final int e;
      private final ae.a f;
      private final acq g;
      private final cje<?> h;

      public a(acq $$0, cje<?> $$1, String $$2, ciz $$3, cfu $$4, int $$5, ae.a $$6, acq $$7) {
         this.a = $$0;
         this.h = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
         this.g = $$7;
      }

      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.add("ingredient", this.c.c());
         $$0.addProperty("result", jb.i.b(this.d).toString());
         $$0.addProperty("count", this.e);
      }

      @Override
      public acq b() {
         return this.a;
      }

      @Override
      public cje<?> c() {
         return this.h;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.f.c();
      }

      @Nullable
      @Override
      public acq e() {
         return this.g;
      }
   }
}
