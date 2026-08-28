import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class goy implements goj<dvn> {
   private final Function<dqs.a, gdx> a;
   private static final Map<dqs.a, akv> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dqs.b.c, akv.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dqs.b.d, akv.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dqs.b.f, akv.b("textures/entity/zombie/zombie.png"));
      $$0.put(dqs.b.g, akv.b("textures/entity/creeper/creeper.png"));
      $$0.put(dqs.b.i, akv.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dqs.b.h, akv.b("textures/entity/piglin/piglin.png"));
      $$0.put(dqs.b.e, hfk.a());
   });

   @Nullable
   public static gdx a(gey $$0, dqs.a $$1) {
      if ($$1 instanceof dqs.b $$2) {
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

   public goy(gok.a $$0) {
      gey $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dvn $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dww $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dsr;
      jn $$9 = $$8 ? $$7.c(dsr.d) : null;
      int $$10 = $$8 ? dyb.a($$9.g()) : $$7.c(dqs.e);
      float $$11 = dyb.b($$10);
      dqs.a $$12 = ((dih)$$7.b()).b();
      gdx $$13 = this.a.apply($$12);
      gmh $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jn $$0, float $$1, float $$2, fft $$3, glx $$4, int $$5, gdx $$6, gmh $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ffx $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, heh.d);
      $$3.b();
   }

   public static gmh a(dqs.a $$0, @Nullable czn $$1) {
      return a($$0, $$1, null);
   }

   public static gmh a(dqs.a $$0, @Nullable czn $$1, @Nullable akv $$2) {
      return $$0 == dqs.b.e && $$1 != null ? gmh.j($$2 != null ? $$2 : fli.Q().an().b($$1.f()).a()) : gmh.h($$2 != null ? $$2 : b.get($$0));
   }
}
