import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gvf implements gup<dzu> {
   private final Function<duq.a, gka> a;
   private static final Map<duq.a, alk> b = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(duq.b.c, alk.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(duq.b.d, alk.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(duq.b.f, alk.b("textures/entity/zombie/zombie.png"));
      $$0.put(duq.b.g, alk.b("textures/entity/creeper/creeper.png"));
      $$0.put(duq.b.i, alk.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(duq.b.h, alk.b("textures/entity/piglin/piglin.png"));
      $$0.put(duq.b.e, hlu.a());
   });

   @Nullable
   public static gka a(glc $$0, duq.a $$1) {
      if ($$1 instanceof duq.b $$2) {
         return (gka)(switch ($$2) {
            case c -> new gjz($$0.a(glf.df));
            case d -> new gjz($$0.a(glf.dZ));
            case e -> new gjz($$0.a(glf.cv));
            case f -> new gjz($$0.a(glf.el));
            case g -> new gjz($$0.a(glf.as));
            case i -> new gkz($$0.a(glf.aF));
            case h -> new gje($$0.a(glf.cl));
         });
      } else {
         return null;
      }
   }

   public gvf(guq.a $$0) {
      glc $$1 = $$0.f();
      this.a = ag.b($$1x -> a($$1, $$1x));
   }

   public void a(dzu $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      float $$7 = $$0.a($$1);
      ebg $$8 = $$0.m();
      boolean $$9 = $$8.b() instanceof dww;
      jc $$10 = $$9 ? $$8.c(dww.d) : null;
      int $$11 = $$9 ? ecm.a($$10.g()) : $$8.c(duq.e);
      float $$12 = ecm.b($$11);
      duq.a $$13 = ((dma)$$8.b()).b();
      gka $$14 = this.a.apply($$13);
      gsn $$15 = a($$13, $$0.c());
      a($$10, $$12, $$7, $$2, $$3, $$4, $$14, $$15);
   }

   public static void a(@Nullable jc $$0, float $$1, float $$2, flq $$3, gsc $$4, int $$5, gka $$6, gsn $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      flt $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hks.d);
      $$3.b();
   }

   public static gsn a(duq.a $$0, @Nullable dda $$1) {
      return a($$0, $$1, null);
   }

   public static gsn a(duq.a $$0, @Nullable dda $$1, @Nullable alk $$2) {
      return $$0 == duq.b.e && $$1 != null ? gsn.j($$2 != null ? $$2 : frf.Q().an().b($$1.f()).a()) : gsn.h($$2 != null ? $$2 : b.get($$0));
   }
}
