import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gvd implements gun<dzs> {
   private final Function<duo.a, gjy> a;
   private static final Map<duo.a, ali> b = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(duo.b.c, ali.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(duo.b.d, ali.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(duo.b.f, ali.b("textures/entity/zombie/zombie.png"));
      $$0.put(duo.b.g, ali.b("textures/entity/creeper/creeper.png"));
      $$0.put(duo.b.i, ali.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(duo.b.h, ali.b("textures/entity/piglin/piglin.png"));
      $$0.put(duo.b.e, hls.a());
   });

   @Nullable
   public static gjy a(gla $$0, duo.a $$1) {
      if ($$1 instanceof duo.b $$2) {
         return (gjy)(switch ($$2) {
            case c -> new gjx($$0.a(gld.df));
            case d -> new gjx($$0.a(gld.dZ));
            case e -> new gjx($$0.a(gld.cv));
            case f -> new gjx($$0.a(gld.el));
            case g -> new gjx($$0.a(gld.as));
            case i -> new gkx($$0.a(gld.aF));
            case h -> new gjc($$0.a(gld.cl));
         });
      } else {
         return null;
      }
   }

   public gvd(guo.a $$0) {
      gla $$1 = $$0.f();
      this.a = ag.b($$1x -> a($$1, $$1x));
   }

   public void a(dzs $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      float $$7 = $$0.a($$1);
      ebe $$8 = $$0.m();
      boolean $$9 = $$8.b() instanceof dwu;
      jb $$10 = $$9 ? $$8.c(dwu.d) : null;
      int $$11 = $$9 ? eck.a($$10.g()) : $$8.c(duo.e);
      float $$12 = eck.b($$11);
      duo.a $$13 = ((dly)$$8.b()).b();
      gjy $$14 = this.a.apply($$13);
      gsl $$15 = a($$13, $$0.c());
      a($$10, $$12, $$7, $$2, $$3, $$4, $$14, $$15);
   }

   public static void a(@Nullable jb $$0, float $$1, float $$2, flo $$3, gsa $$4, int $$5, gjy $$6, gsl $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      flr $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hkq.d);
      $$3.b();
   }

   public static gsl a(duo.a $$0, @Nullable dcy $$1) {
      return a($$0, $$1, null);
   }

   public static gsl a(duo.a $$0, @Nullable dcy $$1, @Nullable ali $$2) {
      return $$0 == duo.b.e && $$1 != null ? gsl.j($$2 != null ? $$2 : frd.Q().an().b($$1.f()).a()) : gsl.h($$2 != null ? $$2 : b.get($$0));
   }
}
