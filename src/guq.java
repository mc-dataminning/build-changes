import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class guq implements gua<eae> {
   private final Function<dva.a, gjl> a;
   private static final Map<dva.a, alr> b = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dva.b.c, alr.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dva.b.d, alr.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dva.b.f, alr.b("textures/entity/zombie/zombie.png"));
      $$0.put(dva.b.g, alr.b("textures/entity/creeper/creeper.png"));
      $$0.put(dva.b.i, alr.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dva.b.h, alr.b("textures/entity/piglin/piglin.png"));
      $$0.put(dva.b.e, hli.a());
   });

   @Nullable
   public static gjl a(gkn $$0, dva.a $$1) {
      if ($$1 instanceof dva.b $$2) {
         return (gjl)(switch ($$2) {
            case c -> new gjk($$0.a(gkq.df));
            case d -> new gjk($$0.a(gkq.dZ));
            case e -> new gjk($$0.a(gkq.cv));
            case f -> new gjk($$0.a(gkq.el));
            case g -> new gjk($$0.a(gkq.as));
            case i -> new gkk($$0.a(gkq.aF));
            case h -> new gip($$0.a(gkq.cl));
         });
      } else {
         return null;
      }
   }

   public guq(gub.a $$0) {
      gkn $$1 = $$0.f();
      this.a = ag.b($$1x -> a($$1, $$1x));
   }

   public void a(eae $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      float $$7 = $$0.a($$1);
      ebq $$8 = $$0.m();
      boolean $$9 = $$8.b() instanceof dxg;
      jc $$10 = $$9 ? $$8.c(dxg.d) : null;
      int $$11 = $$9 ? ecw.a($$10.g()) : $$8.c(dva.e);
      float $$12 = ecw.b($$11);
      dva.a $$13 = ((dmk)$$8.b()).b();
      gjl $$14 = this.a.apply($$13);
      gry $$15 = a($$13, $$0.c());
      a($$10, $$12, $$7, $$2, $$3, $$4, $$14, $$15);
   }

   public static void a(@Nullable jc $$0, float $$1, float $$2, fld $$3, grn $$4, int $$5, gjl $$6, gry $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      flg $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hkg.d);
      $$3.b();
   }

   public static gry a(dva.a $$0, @Nullable ddk $$1) {
      return a($$0, $$1, null);
   }

   public static gry a(dva.a $$0, @Nullable ddk $$1, @Nullable alr $$2) {
      return $$0 == dva.b.e && $$1 != null ? gry.j($$2 != null ? $$2 : fqq.Q().an().b($$1.f()).a()) : gry.h($$2 != null ? $$2 : b.get($$0));
   }
}
