import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gsf implements grp<dyd> {
   private final Function<dtc.a, ghb> a;
   private static final Map<dtc.a, ale> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dtc.b.c, ale.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dtc.b.d, ale.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dtc.b.f, ale.b("textures/entity/zombie/zombie.png"));
      $$0.put(dtc.b.g, ale.b("textures/entity/creeper/creeper.png"));
      $$0.put(dtc.b.i, ale.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dtc.b.h, ale.b("textures/entity/piglin/piglin.png"));
      $$0.put(dtc.b.e, hir.a());
   });

   @Nullable
   public static ghb a(gic $$0, dtc.a $$1) {
      if ($$1 instanceof dtc.b $$2) {
         return (ghb)(switch ($$2) {
            case c -> new gha($$0.a(gif.cZ));
            case d -> new gha($$0.a(gif.dR));
            case e -> new gha($$0.a(gif.cr));
            case f -> new gha($$0.a(gif.ed));
            case g -> new gha($$0.a(gif.ao));
            case i -> new ghz($$0.a(gif.aB));
            case h -> new ggf($$0.a(gif.ch));
         });
      } else {
         return null;
      }
   }

   public gsf(grq.a $$0) {
      gic $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dyd $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dzo $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dvf;
      ja $$9 = $$8 ? $$7.c(dvf.d) : null;
      int $$10 = $$8 ? eau.a($$9.g()) : $$7.c(dtc.e);
      float $$11 = eau.b($$10);
      dtc.a $$12 = ((dkq)$$7.b()).b();
      ghb $$13 = this.a.apply($$12);
      gpn $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ja $$0, float $$1, float $$2, fiq $$3, gpd $$4, int $$5, ghb $$6, gpn $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fiu $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hhp.d);
      $$3.b();
   }

   public static gpn a(dtc.a $$0, @Nullable dbs $$1) {
      return a($$0, $$1, null);
   }

   public static gpn a(dtc.a $$0, @Nullable dbs $$1, @Nullable ale $$2) {
      return $$0 == dtc.b.e && $$1 != null ? gpn.j($$2 != null ? $$2 : fof.Q().an().b($$1.f()).a()) : gpn.h($$2 != null ? $$2 : b.get($$0));
   }
}
