import java.util.Set;
import javax.annotation.Nullable;

public class giu implements gjb.a {
   public static final all a = gjb.a;
   public static final all b = all.b("translucent");
   public static final all c = all.b("item_entity");
   public static final all d = all.b("particles");
   public static final all e = all.b("weather");
   public static final all f = all.b("clouds");
   public static final all g = all.b("entity_outline");
   public static final Set<all> h = Set.of(a);
   public static final Set<all> i = Set.of(a, g);
   public static final Set<all> j = Set.of(a, b, c, d, e, f);
   public fdw<fcu> k = fdw.a();
   @Nullable
   public fdw<fcu> l;
   @Nullable
   public fdw<fcu> m;
   @Nullable
   public fdw<fcu> n;
   @Nullable
   public fdw<fcu> o;
   @Nullable
   public fdw<fcu> p;
   @Nullable
   public fdw<fcu> q;

   @Override
   public void a(all $$0, fdw<fcu> $$1) {
      if ($$0.equals(a)) {
         this.k = $$1;
      } else if ($$0.equals(b)) {
         this.l = $$1;
      } else if ($$0.equals(c)) {
         this.m = $$1;
      } else if ($$0.equals(d)) {
         this.n = $$1;
      } else if ($$0.equals(e)) {
         this.o = $$1;
      } else if ($$0.equals(f)) {
         this.p = $$1;
      } else {
         if (!$$0.equals(g)) {
            throw new IllegalArgumentException("No target with id " + $$0);
         }

         this.q = $$1;
      }
   }

   @Nullable
   @Override
   public fdw<fcu> a(all $$0) {
      if ($$0.equals(a)) {
         return this.k;
      } else if ($$0.equals(b)) {
         return this.l;
      } else if ($$0.equals(c)) {
         return this.m;
      } else if ($$0.equals(d)) {
         return this.n;
      } else if ($$0.equals(e)) {
         return this.o;
      } else if ($$0.equals(f)) {
         return this.p;
      } else {
         return $$0.equals(g) ? this.q : null;
      }
   }

   public void a() {
      this.k = fdw.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
