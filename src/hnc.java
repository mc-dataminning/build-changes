import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class hnc implements hmy {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final gpo c;
   private final hou d;
   private final dkr e;
   private final azv f;
   private final Object2ObjectArrayMap<dkp, hnc.a> g = new Object2ObjectArrayMap();
   private Optional<dkn> h = Optional.empty();
   private Optional<dkm> i = Optional.empty();
   private float j;
   @Nullable
   private dkp k;

   public hnc(gpo $$0, hou $$1, dkr $$2) {
      this.f = $$0.dU().C_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(hmx::m);
      dkp $$0 = this.e.a(this.c.dz(), this.c.dB(), this.c.dF()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.n();
         this.i = $$0.o();
         this.g.values().forEach(hnc.a::o);
         $$0.m().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new hnc.a((awm)$$1.a());
                  this.d.a((hno)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(hnj.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               djm $$1 = this.c.dU();
               int $$2 = $$0x.c() * 2 + 1;
               iv $$3 = iv.a(
                  this.c.dz() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dD() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dF() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(djv.a, $$3);
               if ($$4 > 0) {
                  this.j -= (float)$$4 / 15.0F * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(djv.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.dz();
                  double $$9 = $$6 - this.c.dD();
                  double $$10 = $$7 - this.c.dF();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  hnj $$13 = hnj.a($$0x.a().a(), this.f, this.c.dz() + $$8 / $$11 * $$12, this.c.dD() + $$9 / $$11 * $$12, this.c.dF() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends hmx {
      private int n;
      private int o;

      public a(awm $$0) {
         super($$0, awo.i, hno.t());
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.o < 0) {
            this.n();
         }

         this.o = this.o + this.n;
         this.d = azm.a((float)this.o / 40.0F, 0.0F, 1.0F);
      }

      public void o() {
         this.o = Math.min(this.o, 40);
         this.n = -1;
      }

      public void p() {
         this.o = Math.max(0, this.o);
         this.n = 1;
      }
   }
}
