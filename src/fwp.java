import com.google.common.collect.ImmutableList;

public class fwp<T extends brv> extends fuk<T> {
   private static final int q = 0;
   private static final int r = 1;
   private static final int s = 2;
   protected static final int a = 3;
   private static final float t = 0.0F;
   private static final float u = 16.0F;
   private static final float w = -9.0F;
   private static final float x = 15.0F;
   private static final float y = -9.0F;
   private static final float z = 12.0F;
   private static final float A = -10.0F;
   private static final float B = 15.0F;
   private static final float C = 8.0F;
   private static final float D = 20.0F;
   private static final float E = 14.0F;
   protected static final float b = 18.0F;
   protected static final float f = 5.0F;
   protected static final float g = 14.1F;
   private static final float F = -5.0F;
   private static final String G = "tail1";
   private static final String H = "tail2";
   protected final fys h;
   protected final fys i;
   protected final fys j;
   protected final fys k;
   protected final fys l;
   protected final fys m;
   protected final fys n;
   protected final fys o;
   protected int p = 1;

   public fwp(fys $$0) {
      super(true, 10.0F, 4.0F);
      this.n = $$0.b("head");
      this.o = $$0.b("body");
      this.l = $$0.b("tail1");
      this.m = $$0.b("tail2");
      this.h = $$0.b("left_hind_leg");
      this.i = $$0.b("right_hind_leg");
      this.j = $$0.b("left_front_leg");
      this.k = $$0.b("right_front_leg");
   }

   public static fza a(fyw $$0) {
      fza $$1 = new fza();
      fzb $$2 = $$1.a();
      fyw $$3 = new fyw(-0.02F);
      $$2.a(
         "head",
         fyx.c()
            .a("main", -2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, $$0)
            .a("nose", -1.5F, -0.001F, -4.0F, 3, 2, 2, $$0, 0, 24)
            .a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, $$0, 0, 10)
            .a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, $$0, 6, 10),
         fyu.a(0.0F, 15.0F, -9.0F)
      );
      $$2.a("body", fyx.c().a(20, 0).a(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, $$0), fyu.a(0.0F, 12.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("tail1", fyx.c().a(0, 15).a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, $$0), fyu.a(0.0F, 15.0F, 8.0F, 0.9F, 0.0F, 0.0F));
      $$2.a("tail2", fyx.c().a(4, 15).a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, $$3), fyu.a(0.0F, 20.0F, 14.0F));
      fyx $$4 = fyx.c().a(8, 13).a(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, $$0);
      $$2.a("left_hind_leg", $$4, fyu.a(1.1F, 18.0F, 5.0F));
      $$2.a("right_hind_leg", $$4, fyu.a(-1.1F, 18.0F, 5.0F));
      fyx $$5 = fyx.c().a(40, 0).a(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, $$0);
      $$2.a("left_front_leg", $$5, fyu.a(1.2F, 14.1F, -5.0F));
      $$2.a("right_front_leg", $$5, fyu.a(-1.2F, 14.1F, -5.0F));
      return $$1;
   }

   @Override
   protected Iterable<fys> a() {
      return ImmutableList.of(this.n);
   }

   @Override
   protected Iterable<fys> b() {
      return ImmutableList.of(this.o, this.h, this.i, this.j, this.k, this.l, this.m);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.n.e = $$5 * (float) (Math.PI / 180.0);
      this.n.f = $$4 * (float) (Math.PI / 180.0);
      if (this.p != 3) {
         this.o.e = (float) (Math.PI / 2);
         if (this.p == 2) {
            this.h.e = aym.b($$1 * 0.6662F) * $$2;
            this.i.e = aym.b($$1 * 0.6662F + 0.3F) * $$2;
            this.j.e = aym.b($$1 * 0.6662F + (float) Math.PI + 0.3F) * $$2;
            this.k.e = aym.b($$1 * 0.6662F + (float) Math.PI) * $$2;
            this.m.e = 1.7278761F + (float) (Math.PI / 10) * aym.b($$1) * $$2;
         } else {
            this.h.e = aym.b($$1 * 0.6662F) * $$2;
            this.i.e = aym.b($$1 * 0.6662F + (float) Math.PI) * $$2;
            this.j.e = aym.b($$1 * 0.6662F + (float) Math.PI) * $$2;
            this.k.e = aym.b($$1 * 0.6662F) * $$2;
            if (this.p == 1) {
               this.m.e = 1.7278761F + (float) (Math.PI / 4) * aym.b($$1) * $$2;
            } else {
               this.m.e = 1.7278761F + 0.47123894F * aym.b($$1) * $$2;
            }
         }
      }
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.o.c = 12.0F;
      this.o.d = -10.0F;
      this.n.c = 15.0F;
      this.n.d = -9.0F;
      this.l.c = 15.0F;
      this.l.d = 8.0F;
      this.m.c = 20.0F;
      this.m.d = 14.0F;
      this.j.c = 14.1F;
      this.j.d = -5.0F;
      this.k.c = 14.1F;
      this.k.d = -5.0F;
      this.h.c = 18.0F;
      this.h.d = 5.0F;
      this.i.c = 18.0F;
      this.i.d = 5.0F;
      this.l.e = 0.9F;
      if ($$0.cf()) {
         this.o.c++;
         this.n.c += 2.0F;
         this.l.c++;
         this.m.c += -4.0F;
         this.m.d += 2.0F;
         this.l.e = (float) (Math.PI / 2);
         this.m.e = (float) (Math.PI / 2);
         this.p = 0;
      } else if ($$0.cg()) {
         this.m.c = this.l.c;
         this.m.d += 2.0F;
         this.l.e = (float) (Math.PI / 2);
         this.m.e = (float) (Math.PI / 2);
         this.p = 2;
      } else {
         this.p = 1;
      }
   }
}
