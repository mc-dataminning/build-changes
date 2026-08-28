import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class of implements nz {
   private final oa b;
   private final dbh c;
   private final cxd d;
   private final dbr e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dbb.a<?> j;

   private of(oa $$0, dbh $$1, dgy $$2, dbr $$3, float $$4, int $$5, dbb.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.i();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dbb> of a(dbr $$0, oa $$1, dgy $$2, float $$3, int $$4, dcf<T> $$5, dbb.a<T> $$6) {
      return new of($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static of a(dbr $$0, oa $$1, dgy $$2, float $$3, int $$4) {
      return new of($$1, dbh.a, $$2, $$0, $$3, $$4, dbg::new);
   }

   public static of b(dbr $$0, oa $$1, dgy $$2, float $$3, int $$4) {
      return new of($$1, c($$2), $$2, $$0, $$3, $$4, dbe::new);
   }

   public static of c(dbr $$0, oa $$1, dgy $$2, float $$3, int $$4) {
      return new of($$1, b($$2), $$2, $$0, $$3, $$4, dcp::new);
   }

   public static of d(dbr $$0, oa $$1, dgy $$2, float $$3, int $$4) {
      return new of($$1, dbh.a, $$2, $$0, $$3, $$4, dcu::new);
   }

   public of b(String $$0, aq<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public of b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cxd a() {
      return this.d;
   }

   @Override
   public void a(ob $$0, akt<dbv<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      dbb $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cxh(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dbh b(dgy $$0) {
      if ($$0.i().g().b(kv.w)) {
         return dbh.a;
      } else {
         return $$0.i() instanceof cvo ? dbh.b : dbh.c;
      }
   }

   private static dbh c(dgy $$0) {
      return $$0.i() instanceof cvo ? dbh.b : dbh.c;
   }

   private static dbh a(dcf<? extends dbb> $$0, dgy $$1) {
      if ($$0 == dcf.o) {
         return b($$1);
      } else if ($$0 == dcf.p) {
         return c($$1);
      } else if ($$0 != dcf.q && $$0 != dcf.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dbh.a;
      }
   }

   private void a(akt<dbv<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
