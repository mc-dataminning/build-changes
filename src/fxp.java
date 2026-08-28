import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fxp extends fui {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final wo d;
   private final List<wo> s;
   private final ImmutableList<fxp.a> u;
   private fpj v = fpj.a;
   private int w;
   private int x;

   protected fxp(wo $$0, List<wo> $$1, ImmutableList<fxp.a> $$2) {
      super($$0);
      this.s = $$1;
      this.d = wn.a($$0, wr.a($$1, wn.a));
      this.u = $$2;
   }

   @Override
   public wo i() {
      return this.d;
   }

   @Override
   public void aR_() {
      UnmodifiableIterator $$1 = this.u.iterator();

      while ($$1.hasNext()) {
         fxp.a $$0 = (fxp.a)$$1.next();
         this.x = Math.max(this.x, 20 + this.p.a($$0.a) + 20);
      }

      int $$1x = 5 + this.x + 5;
      int $$2 = $$1x * this.u.size();
      this.v = fpj.a(this.p, $$2, this.s.toArray(new wo[0]));
      int $$3 = this.v.a() * 9;
      this.w = (int)((double)this.o / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.w + $$3 + 9 * 2;
      int $$5 = (int)((double)this.n / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.u.iterator(); var6.hasNext(); $$5 += $$1x) {
         fxp.a $$6 = (fxp.a)var6.next();
         this.c(fop.a($$6.a, $$6.b).a($$5, $$4, this.x, 20).a());
      }
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.w - 9 * 2, -1);
      this.v.a($$0, this.n / 2, this.w);
   }

   @Override
   public boolean aG_() {
      return false;
   }

   public static final class a {
      final wo a;
      final fop.c b;

      public a(wo $$0, fop.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
