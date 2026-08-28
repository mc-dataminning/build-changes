import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gtt implements gtd<dzh> {
   private final Function<dud.a, gin> a;
   private static final Map<dud.a, alg> b = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dud.b.c, alg.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dud.b.d, alg.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dud.b.f, alg.b("textures/entity/zombie/zombie.png"));
      $$0.put(dud.b.g, alg.b("textures/entity/creeper/creeper.png"));
      $$0.put(dud.b.i, alg.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dud.b.h, alg.b("textures/entity/piglin/piglin.png"));
      $$0.put(dud.b.e, hki.a());
   });

   @Nullable
   public static gin a(gjp $$0, dud.a $$1) {
      if ($$1 instanceof dud.b $$2) {
         return (gin)(switch ($$2) {
            case c -> new gim($$0.a(gjs.df));
            case d -> new gim($$0.a(gjs.dZ));
            case e -> new gim($$0.a(gjs.cv));
            case f -> new gim($$0.a(gjs.el));
            case g -> new gim($$0.a(gjs.as));
            case i -> new gjm($$0.a(gjs.aF));
            case h -> new ghr($$0.a(gjs.cl));
         });
      } else {
         return null;
      }
   }

   public gtt(gte.a $$0) {
      gjp $$1 = $$0.f();
      this.a = ag.b($$1x -> a($$1, $$1x));
   }

   public void a(dzh $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      float $$7 = $$0.a($$1);
      eat $$8 = $$0.m();
      boolean $$9 = $$8.b() instanceof dwj;
      jb $$10 = $$9 ? $$8.c(dwj.d) : null;
      int $$11 = $$9 ? ebz.a($$10.g()) : $$8.c(dud.e);
      float $$12 = ebz.b($$11);
      dud.a $$13 = ((dln)$$8.b()).b();
      gin $$14 = this.a.apply($$13);
      grc $$15 = a($$13, $$0.c());
      a($$10, $$12, $$7, $$2, $$3, $$4, $$14, $$15);
   }

   public static void a(@Nullable jb $$0, float $$1, float $$2, fkd $$3, gqr $$4, int $$5, gin $$6, grc $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fkh $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hjg.d);
      $$3.b();
   }

   public static grc a(dud.a $$0, @Nullable dcn $$1) {
      return a($$0, $$1, null);
   }

   public static grc a(dud.a $$0, @Nullable dcn $$1, @Nullable alg $$2) {
      return $$0 == dud.b.e && $$1 != null ? grc.j($$2 != null ? $$2 : fpt.Q().an().b($$1.f()).a()) : grc.h($$2 != null ? $$2 : b.get($$0));
   }
}
