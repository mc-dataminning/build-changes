import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gox implements goi<dvo> {
   private final Function<dqt.a, gdx> a;
   private static final Map<dqt.a, aku> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dqt.b.c, aku.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dqt.b.d, aku.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dqt.b.f, aku.b("textures/entity/zombie/zombie.png"));
      $$0.put(dqt.b.g, aku.b("textures/entity/creeper/creeper.png"));
      $$0.put(dqt.b.i, aku.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dqt.b.h, aku.b("textures/entity/piglin/piglin.png"));
      $$0.put(dqt.b.e, hfb.a());
   });

   @Nullable
   public static gdx a(gey $$0, dqt.a $$1) {
      if ($$1 instanceof dqt.b $$2) {
         return (gdx)(switch ($$2) {
            case c -> new gdw($$0.a(gfb.cN));
            case d -> new gdw($$0.a(gfb.dF));
            case e -> new gdw($$0.a(gfb.ch));
            case f -> new gdw($$0.a(gfb.dR));
            case g -> new gdw($$0.a(gfb.ak));
            case i -> new gev($$0.a(gfb.av));
            case h -> new gdb($$0.a(gfb.bX));
         });
      } else {
         return null;
      }
   }

   public gox(goj.a $$0) {
      gey $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dvo $$0, float $$1, ffu $$2, glx $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dwx $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dss;
      jn $$9 = $$8 ? $$7.c(dss.d) : null;
      int $$10 = $$8 ? dyc.a($$9.g()) : $$7.c(dqt.e);
      float $$11 = dyc.b($$10);
      dqt.a $$12 = ((dii)$$7.b()).b();
      gdx $$13 = this.a.apply($$12);
      gmh $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jn $$0, float $$1, float $$2, ffu $$3, glx $$4, int $$5, gdx $$6, gmh $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ffy $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hea.d);
      $$3.b();
   }

   public static gmh a(dqt.a $$0, @Nullable czo $$1) {
      aku $$2 = b.get($$0);
      if ($$0 == dqt.b.e && $$1 != null) {
         hfl $$3 = flj.Q().an();
         return gmh.j($$3.b($$1.f()).a());
      } else {
         return gmh.h($$2);
      }
   }
}
