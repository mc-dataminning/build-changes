import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fwb implements fvt<dht> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fnj h;
   private final fnj i;
   private final fnj j;
   private final fnj k;
   private final fnj l;
   private final fnj m;
   private final fnj n;
   private final ghe o = Objects.requireNonNull(fui.c(dhu.a));
   private static final float p = 0.125F;

   public fwb(fvu.a $$0) {
      fnj $$1 = $$0.a(fni.G);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fnj $$2 = $$0.a(fni.H);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      fnn $$2 = new fnn(0.2F);
      fnn $$3 = new fnn(-0.1F);
      $$1.a(
         "neck",
         fno.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fnl.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fno $$4 = fno.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fnl.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fnl.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fnp.a($$0, 32, 32);
   }

   public static fnp c() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      fno $$2 = fno.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ic.c));
      $$1.a("back", $$2, fnl.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fnl.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fnl.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fnl.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fnp.a($$0, 16, 16);
   }

   @Nullable
   private static ghe a(cnb $$0) {
      ghe $$1 = fui.c(dhu.a($$0));
      if ($$1 == null) {
         $$1 = fui.c(dhu.a(cnj.qK));
      }

      return $$1;
   }

   public void a(dht $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      $$2.a();
      ic $$6 = $$0.l();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dht.b $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().X() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dht.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (aup.b($$10) + 0.5F) * aup.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = aup.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = aup.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      eqo $$15 = this.o.a($$3, fub::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dht.a $$16 = $$0.m();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fnj $$0, eqk $$1, ftt $$2, int $$3, int $$4, @Nullable ghe $$5) {
      if ($$5 == null) {
         $$5 = a(cnj.qK);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fub::c), $$3, $$4);
      }
   }
}
