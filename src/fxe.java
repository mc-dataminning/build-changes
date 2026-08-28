import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fxe extends ftx {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final xv d;
   private final List<xv> s;
   private final ImmutableList<fxe.a> u;
   private foy v = foy.a;
   private int w;
   private int x;

   protected fxe(xv $$0, List<xv> $$1, ImmutableList<fxe.a> $$2) {
      super($$0);
      this.s = $$1;
      this.d = xu.a($$0, xy.a($$1, xu.a));
      this.u = $$2;
   }

   @Override
   public xv i() {
      return this.d;
   }

   @Override
   public void aT_() {
      UnmodifiableIterator $$1 = this.u.iterator();

      while ($$1.hasNext()) {
         fxe.a $$0 = (fxe.a)$$1.next();
         this.x = Math.max(this.x, 20 + this.p.a($$0.a) + 20);
      }

      int $$1x = 5 + this.x + 5;
      int $$2 = $$1x * this.u.size();
      this.v = foy.a(this.p, $$2, this.s.toArray(new xv[0]));
      int $$3 = this.v.a() * 9;
      this.w = (int)((double)this.o / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.w + $$3 + 9 * 2;
      int $$5 = (int)((double)this.n / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.u.iterator(); var6.hasNext(); $$5 += $$1x) {
         fxe.a $$6 = (fxe.a)var6.next();
         this.c(foe.a($$6.a, $$6.b).a($$5, $$4, this.x, 20).a());
      }
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.w - 9 * 2, -1);
      this.v.a($$0, this.n / 2, this.w);
   }

   @Override
   public boolean aH_() {
      return false;
   }

   public static final class a {
      final xv a;
      final foe.c b;

      public a(xv $$0, foe.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
