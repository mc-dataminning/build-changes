import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class goz implements gok<dvo> {
   private final Function<dqt.a, gdy> a;
   private static final Map<dqt.a, akv> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dqt.b.c, akv.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dqt.b.d, akv.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dqt.b.f, akv.b("textures/entity/zombie/zombie.png"));
      $$0.put(dqt.b.g, akv.b("textures/entity/creeper/creeper.png"));
      $$0.put(dqt.b.i, akv.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dqt.b.h, akv.b("textures/entity/piglin/piglin.png"));
      $$0.put(dqt.b.e, hfl.a());
   });

   @Nullable
   public static gdy a(gez $$0, dqt.a $$1) {
      if ($$1 instanceof dqt.b $$2) {
         return (gdy)(switch ($$2) {
            case c -> new gdx($$0.a(gfc.cN));
            case d -> new gdx($$0.a(gfc.dF));
            case e -> new gdx($$0.a(gfc.ch));
            case f -> new gdx($$0.a(gfc.dR));
            case g -> new gdx($$0.a(gfc.ak));
            case i -> new gew($$0.a(gfc.av));
            case h -> new gdc($$0.a(gfc.bX));
         });
      } else {
         return null;
      }
   }

   public goz(gol.a $$0) {
      gez $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dvo $$0, float $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dwx $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dss;
      jn $$9 = $$8 ? $$7.c(dss.d) : null;
      int $$10 = $$8 ? dyc.a($$9.g()) : $$7.c(dqt.e);
      float $$11 = dyc.b($$10);
      dqt.a $$12 = ((dii)$$7.b()).b();
      gdy $$13 = this.a.apply($$12);
      gmi $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jn $$0, float $$1, float $$2, ffu $$3, gly $$4, int $$5, gdy $$6, gmi $$7) {
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
      $$6.a($$3, $$9, $$5, hei.d);
      $$3.b();
   }

   public static gmi a(dqt.a $$0, @Nullable czo $$1) {
      return a($$0, $$1, null);
   }

   public static gmi a(dqt.a $$0, @Nullable czo $$1, @Nullable akv $$2) {
      return $$0 == dqt.b.e && $$1 != null ? gmi.j($$2 != null ? $$2 : flj.Q().an().b($$1.f()).a()) : gmi.h($$2 != null ? $$2 : b.get($$0));
   }
}
