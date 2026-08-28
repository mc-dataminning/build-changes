import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fvd extends fwf {
   private static final int d = 20;
   private final wv s;
   private frg u = frg.a;
   protected wv a;
   protected wv b;
   private int v;
   protected final BooleanConsumer c;
   private final List<fqn> w = Lists.newArrayList();

   public fvd(BooleanConsumer $$0, wv $$1, wv $$2) {
      this($$0, $$1, $$2, wu.f, wu.g);
   }

   public fvd(BooleanConsumer $$0, wv $$1, wv $$2, wv $$3, wv $$4) {
      super($$1);
      this.c = $$0;
      this.s = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public wv i() {
      return wu.a(super.i(), this.s);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.u = frg.a(this.p, this.s, this.n - 50);
      int $$0 = azk.a(this.E() + this.F() + 20, this.o / 6 + 96, this.o - 24);
      this.w.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fqn.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(fqn.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fqn $$0) {
      this.w.add(this.c($$0));
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.m(), 16777215);
      this.u.a($$0, this.n / 2, this.E());
   }

   private int m() {
      int $$0 = (this.o - this.F()) / 2;
      return azk.a($$0 - 20 - 9, 10, 80);
   }

   private int E() {
      return this.m() + 20;
   }

   private int F() {
      return this.u.a() * 9;
   }

   public void b(int $$0) {
      this.v = $$0;

      for (fqn $$1 : this.w) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.v == 0) {
         for (fqn $$0 : this.w) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.c.accept(false);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }
}
