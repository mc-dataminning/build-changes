import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gpa implements gol<dvp> {
   private final Function<dqu.a, gdz> a;
   private static final Map<dqu.a, akv> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dqu.b.c, akv.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dqu.b.d, akv.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dqu.b.f, akv.b("textures/entity/zombie/zombie.png"));
      $$0.put(dqu.b.g, akv.b("textures/entity/creeper/creeper.png"));
      $$0.put(dqu.b.i, akv.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dqu.b.h, akv.b("textures/entity/piglin/piglin.png"));
      $$0.put(dqu.b.e, hfm.a());
   });

   @Nullable
   public static gdz a(gfa $$0, dqu.a $$1) {
      if ($$1 instanceof dqu.b $$2) {
         return (gdz)(switch ($$2) {
            case c -> new gdy($$0.a(gfd.cN));
            case d -> new gdy($$0.a(gfd.dF));
            case e -> new gdy($$0.a(gfd.ch));
            case f -> new gdy($$0.a(gfd.dR));
            case g -> new gdy($$0.a(gfd.ak));
            case i -> new gex($$0.a(gfd.av));
            case h -> new gdd($$0.a(gfd.bX));
         });
      } else {
         return null;
      }
   }

   public gpa(gom.a $$0) {
      gfa $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dvp $$0, float $$1, ffv $$2, glz $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dwy $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dst;
      jn $$9 = $$8 ? $$7.c(dst.d) : null;
      int $$10 = $$8 ? dyd.a($$9.g()) : $$7.c(dqu.e);
      float $$11 = dyd.b($$10);
      dqu.a $$12 = ((dij)$$7.b()).b();
      gdz $$13 = this.a.apply($$12);
      gmj $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jn $$0, float $$1, float $$2, ffv $$3, glz $$4, int $$5, gdz $$6, gmj $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ffz $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hej.d);
      $$3.b();
   }

   public static gmj a(dqu.a $$0, @Nullable czp $$1) {
      return a($$0, $$1, null);
   }

   public static gmj a(dqu.a $$0, @Nullable czp $$1, @Nullable akv $$2) {
      return $$0 == dqu.b.e && $$1 != null ? gmj.j($$2 != null ? $$2 : flk.Q().an().b($$1.f()).a()) : gmj.h($$2 != null ? $$2 : b.get($$0));
   }
}
