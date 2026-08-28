import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oh implements ob {
   private final oc b;
   private final dbx c;
   private final cxu d;
   private final dch e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dbr.a<?> j;

   private oh(oc $$0, dbx $$1, dho $$2, dch $$3, float $$4, int $$5, dbr.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.i();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dbr> oh a(dch $$0, oc $$1, dho $$2, float $$3, int $$4, dcv<T> $$5, dbr.a<T> $$6) {
      return new oh($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oh a(dch $$0, oc $$1, dho $$2, float $$3, int $$4) {
      return new oh($$1, dbx.a, $$2, $$0, $$3, $$4, dbw::new);
   }

   public static oh b(dch $$0, oc $$1, dho $$2, float $$3, int $$4) {
      return new oh($$1, c($$2), $$2, $$0, $$3, $$4, dbu::new);
   }

   public static oh c(dch $$0, oc $$1, dho $$2, float $$3, int $$4) {
      return new oh($$1, b($$2), $$2, $$0, $$3, $$4, ddf::new);
   }

   public static oh d(dch $$0, oc $$1, dho $$2, float $$3, int $$4) {
      return new oh($$1, dbx.a, $$2, $$0, $$3, $$4, ddk::new);
   }

   public oh b(String $$0, aq<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oh b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cxu a() {
      return this.d;
   }

   @Override
   public void a(od $$0, alc<dcl<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      dbr $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cxy(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dbx b(dho $$0) {
      if ($$0.i().g().c(kx.w)) {
         return dbx.a;
      } else {
         return $$0.i() instanceof cwf ? dbx.b : dbx.c;
      }
   }

   private static dbx c(dho $$0) {
      return $$0.i() instanceof cwf ? dbx.b : dbx.c;
   }

   private static dbx a(dcv<? extends dbr> $$0, dho $$1) {
      if ($$0 == dcv.o) {
         return b($$1);
      } else if ($$0 == dcv.p) {
         return c($$1);
      } else if ($$0 != dcv.q && $$0 != dcv.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dbx.a;
      }
   }

   private void a(alc<dcl<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
