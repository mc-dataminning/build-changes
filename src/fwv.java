import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fwv<T extends biy, M extends ffg<T>, A extends ffg<T>> extends fxf<T, M> {
   private static final Map<String, aer> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final fyt d;

   public fwv(fus<T, M> $$0, A $$1, A $$2, gbb $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(foi.g);
   }

   public void a(elf $$0, fnu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bin.e, $$2, this.a(bin.e));
      this.a($$0, $$1, $$3, bin.d, $$2, this.a(bin.d));
      this.a($$0, $$1, $$3, bin.c, $$2, this.a(bin.c));
      this.a($$0, $$1, $$3, bin.f, $$2, this.a(bin.f));
   }

   private void a(elf $$0, fnu $$1, T $$2, bin $$3, int $$4, A $$5) {
      cix $$6 = $$2.c($$3);
      if ($$6.d() instanceof cgh $$7) {
         if ($$7.g() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            if ($$7 instanceof chn $$10) {
               int $$11 = $$10.e_($$6);
               float $$12 = (float)($$11 >> 16 & 0xFF) / 255.0F;
               float $$13 = (float)($$11 >> 8 & 0xFF) / 255.0F;
               float $$14 = (float)($$11 & 0xFF) / 255.0F;
               this.a($$0, $$1, $$4, $$7, $$5, $$9, $$12, $$13, $$14, null);
               this.a($$0, $$1, $$4, $$7, $$5, $$9, 1.0F, 1.0F, 1.0F, "overlay");
            } else {
               this.a($$0, $$1, $$4, $$7, $$5, $$9, 1.0F, 1.0F, 1.0F, null);
            }

            ckz.a($$2.dK().B_(), $$6, true).ifPresent($$6x -> this.a($$7.d(), $$0, $$1, $$4, $$6x, $$5, $$9));
            if ($$6.B()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bin $$1) {
      $$0.c_(false);
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

   private void a(elf $$0, fnu $$1, int $$2, cgh $$3, A $$4, boolean $$5, float $$6, float $$7, float $$8, @Nullable String $$9) {
      elj $$10 = $$1.getBuffer(foc.a(this.a($$3, $$5, $$9)));
      $$4.a($$0, $$10, $$2, fyl.d, $$6, $$7, $$8, 1.0F);
   }

   private void a(cgi $$0, elf $$1, fnu $$2, int $$3, ckz $$4, A $$5, boolean $$6) {
      fyu $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      elj $$8 = $$7.a($$2.getBuffer(foi.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(elf $$0, fnu $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(foc.l()), $$2, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bin $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bin $$0) {
      return $$0 == bin.d;
   }

   private aer a(cgh $$0, boolean $$1, @Nullable String $$2) {
      String $$3 = "textures/models/armor/" + $$0.d().e() + "_layer_" + ($$1 ? 2 : 1) + ($$2 == null ? "" : "_" + $$2) + ".png";
      return a.computeIfAbsent($$3, aer::new);
   }
}
