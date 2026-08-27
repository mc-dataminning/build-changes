import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class get<T extends bog, M extends fmo<T>, A extends fmo<T>> extends gfd<T, M> {
   private static final Map<String, aiy> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final ggs d;

   public get(gcn<T, M> $$0, A $$1, A $$2, giz $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(fwa.g);
   }

   public void a(esa $$0, fvl $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bnv.e, $$2, this.a(bnv.e));
      this.a($$0, $$1, $$3, bnv.d, $$2, this.a(bnv.d));
      this.a($$0, $$1, $$3, bnv.c, $$2, this.a(bnv.c));
      this.a($$0, $$1, $$3, bnv.f, $$2, this.a(bnv.f));
   }

   private void a(esa $$0, fvl $$1, T $$2, bnv $$3, int $$4, A $$5) {
      coz $$6 = $$2.c($$3);
      if ($$6.d() instanceof cmj $$7) {
         if ($$7.g() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            if ($$7 instanceof cnq $$10) {
               int $$11 = $$10.e_($$6);
               float $$12 = (float)($$11 >> 16 & 0xFF) / 255.0F;
               float $$13 = (float)($$11 >> 8 & 0xFF) / 255.0F;
               float $$14 = (float)($$11 & 0xFF) / 255.0F;
               this.a($$0, $$1, $$4, $$7, $$5, $$9, $$12, $$13, $$14, null);
               this.a($$0, $$1, $$4, $$7, $$5, $$9, 1.0F, 1.0F, 1.0F, "overlay");
            } else {
               this.a($$0, $$1, $$4, $$7, $$5, $$9, 1.0F, 1.0F, 1.0F, null);
            }

            cra.a($$2.dM().I_(), $$6, true).ifPresent($$6x -> this.a($$7.d(), $$0, $$1, $$4, $$6x, $$5, $$9));
            if ($$6.C()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bnv $$1) {
      $$0.b_(false);
      switch ($$1) {
         case f:
            $$0.k.k = true;
            $$0.l.k = true;
            break;
         case e:
            $$0.m.k = true;
            $$0.n.k = true;
            $$0.o.k = true;
            break;
         case d:
            $$0.m.k = true;
            $$0.p.k = true;
            $$0.q.k = true;
            break;
         case c:
            $$0.p.k = true;
            $$0.q.k = true;
      }
   }

   private void a(esa $$0, fvl $$1, int $$2, cmj $$3, A $$4, boolean $$5, float $$6, float $$7, float $$8, @Nullable String $$9) {
      ese $$10 = $$1.getBuffer(fvt.a(this.a($$3, $$5, $$9)));
      $$4.a($$0, $$10, $$2, ggk.d, $$6, $$7, $$8, 1.0F);
   }

   private void a(cmk $$0, esa $$1, fvl $$2, int $$3, cra $$4, A $$5, boolean $$6) {
      ggt $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      ese $$8 = $$7.a($$2.getBuffer(fwa.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, ggk.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(esa $$0, fvl $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(fvt.k()), $$2, ggk.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bnv $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bnv $$0) {
      return $$0 == bnv.d;
   }

   private aiy a(cmj $$0, boolean $$1, @Nullable String $$2) {
      String $$3 = "textures/models/armor/" + $$0.d().e() + "_layer_" + ($$1 ? 2 : 1) + ($$2 == null ? "" : "_" + $$2) + ".png";
      return a.computeIfAbsent($$3, aiy::new);
   }
}
