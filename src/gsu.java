import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gsu implements gse<dyn> {
   private final Function<dtk.a, gho> a;
   private static final Map<dtk.a, alg> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dtk.b.c, alg.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dtk.b.d, alg.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dtk.b.f, alg.b("textures/entity/zombie/zombie.png"));
      $$0.put(dtk.b.g, alg.b("textures/entity/creeper/creeper.png"));
      $$0.put(dtk.b.i, alg.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dtk.b.h, alg.b("textures/entity/piglin/piglin.png"));
      $$0.put(dtk.b.e, hjh.a());
   });

   @Nullable
   public static gho a(giq $$0, dtk.a $$1) {
      if ($$1 instanceof dtk.b $$2) {
         return (gho)(switch ($$2) {
            case c -> new ghn($$0.a(git.db));
            case d -> new ghn($$0.a(git.dV));
            case e -> new ghn($$0.a(git.ct));
            case f -> new ghn($$0.a(git.eh));
            case g -> new ghn($$0.a(git.aq));
            case i -> new gin($$0.a(git.aD));
            case h -> new ggs($$0.a(git.cj));
         });
      } else {
         return null;
      }
   }

   public gsu(gsf.a $$0) {
      giq $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dyn $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      float $$7 = $$0.a($$1);
      dzz $$8 = $$0.m();
      boolean $$9 = $$8.b() instanceof dvp;
      ja $$10 = $$9 ? $$8.c(dvp.d) : null;
      int $$11 = $$9 ? ebf.a($$10.g()) : $$8.c(dtk.e);
      float $$12 = ebf.b($$11);
      dtk.a $$13 = ((dkw)$$8.b()).b();
      gho $$14 = this.a.apply($$13);
      gqc $$15 = a($$13, $$0.c());
      a($$10, $$12, $$7, $$2, $$3, $$4, $$14, $$15);
   }

   public static void a(@Nullable ja $$0, float $$1, float $$2, fjc $$3, gps $$4, int $$5, gho $$6, gqc $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fjg $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hif.d);
      $$3.b();
   }

   public static gqc a(dtk.a $$0, @Nullable dby $$1) {
      return a($$0, $$1, null);
   }

   public static gqc a(dtk.a $$0, @Nullable dby $$1, @Nullable alg $$2) {
      return $$0 == dtk.b.e && $$1 != null ? gqc.j($$2 != null ? $$2 : fos.Q().an().b($$1.f()).a()) : gqc.h($$2 != null ? $$2 : b.get($$0));
   }
}
