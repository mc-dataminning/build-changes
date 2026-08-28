import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pb implements ov {
   private final ow b;
   private final dbh c;
   private final cxc d;
   private final dbr e;
   private final float f;
   private final int g;
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dbb.a<?> j;

   private pb(ow $$0, dbh $$1, dgy $$2, dbr $$3, float $$4, int $$5, dbb.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dbb> pb a(dbr $$0, ow $$1, dgy $$2, float $$3, int $$4, dcf<T> $$5, dbb.a<T> $$6) {
      return new pb($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static pb a(dbr $$0, ow $$1, dgy $$2, float $$3, int $$4) {
      return new pb($$1, dbh.a, $$2, $$0, $$3, $$4, dbg::new);
   }

   public static pb b(dbr $$0, ow $$1, dgy $$2, float $$3, int $$4) {
      return new pb($$1, c($$2), $$2, $$0, $$3, $$4, dbe::new);
   }

   public static pb c(dbr $$0, ow $$1, dgy $$2, float $$3, int $$4) {
      return new pb($$1, b($$2), $$2, $$0, $$3, $$4, dcp::new);
   }

   public static pb d(dbr $$0, ow $$1, dgy $$2, float $$3, int $$4) {
      return new pb($$1, dbh.a, $$2, $$0, $$3, $$4, dcu::new);
   }

   public pb b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public pb b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cxc a() {
      return this.d;
   }

   @Override
   public void a(ox $$0, alo<dbv<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.h.forEach($$2::a);
      dbb $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cxg(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dbh b(dgy $$0) {
      if ($$0.j().g().b(ku.w)) {
         return dbh.a;
      } else {
         return $$0.j() instanceof cvm ? dbh.b : dbh.c;
      }
   }

   private static dbh c(dgy $$0) {
      return $$0.j() instanceof cvm ? dbh.b : dbh.c;
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

   private void a(alo<dbv<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
