import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gtc implements gsm<dyv> {
   private final Function<dtr.a, ghw> a;
   private static final Map<dtr.a, alg> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dtr.b.c, alg.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dtr.b.d, alg.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dtr.b.f, alg.b("textures/entity/zombie/zombie.png"));
      $$0.put(dtr.b.g, alg.b("textures/entity/creeper/creeper.png"));
      $$0.put(dtr.b.i, alg.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dtr.b.h, alg.b("textures/entity/piglin/piglin.png"));
      $$0.put(dtr.b.e, hjp.a());
   });

   @Nullable
   public static ghw a(giy $$0, dtr.a $$1) {
      if ($$1 instanceof dtr.b $$2) {
         return (ghw)(switch ($$2) {
            case c -> new ghv($$0.a(gjb.dd));
            case d -> new ghv($$0.a(gjb.dX));
            case e -> new ghv($$0.a(gjb.cv));
            case f -> new ghv($$0.a(gjb.ej));
            case g -> new ghv($$0.a(gjb.as));
            case i -> new giv($$0.a(gjb.aF));
            case h -> new gha($$0.a(gjb.cl));
         });
      } else {
         return null;
      }
   }

   public gtc(gsn.a $$0) {
      giy $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dyv $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      float $$7 = $$0.a($$1);
      eah $$8 = $$0.m();
      boolean $$9 = $$8.b() instanceof dvx;
      ja $$10 = $$9 ? $$8.c(dvx.d) : null;
      int $$11 = $$9 ? ebn.a($$10.g()) : $$8.c(dtr.e);
      float $$12 = ebn.b($$11);
      dtr.a $$13 = ((dlb)$$8.b()).b();
      ghw $$14 = this.a.apply($$13);
      gqk $$15 = a($$13, $$0.c());
      a($$10, $$12, $$7, $$2, $$3, $$4, $$14, $$15);
   }

   public static void a(@Nullable ja $$0, float $$1, float $$2, fjj $$3, gqa $$4, int $$5, ghw $$6, gqk $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fjn $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hin.d);
      $$3.b();
   }

   public static gqk a(dtr.a $$0, @Nullable dcd $$1) {
      return a($$0, $$1, null);
   }

   public static gqk a(dtr.a $$0, @Nullable dcd $$1, @Nullable alg $$2) {
      return $$0 == dtr.b.e && $$1 != null ? gqk.j($$2 != null ? $$2 : foz.Q().an().b($$1.f()).a()) : gqk.h($$2 != null ? $$2 : b.get($$0));
   }
}
