import java.util.Set;
import javax.annotation.Nullable;

public class grj implements grr.a {
   public static final alr a = grr.a;
   public static final alr b = alr.b("translucent");
   public static final alr c = alr.b("item_entity");
   public static final alr d = alr.b("particles");
   public static final alr e = alr.b("weather");
   public static final alr f = alr.b("clouds");
   public static final alr g = alr.b("entity_outline");
   public static final Set<alr> h = Set.of(a);
   public static final Set<alr> i = Set.of(a, g);
   public static final Set<alr> j = Set.of(a, b, c, d, e, f);
   public fkr<fjr> k = fkr.a();
   @Nullable
   public fkr<fjr> l;
   @Nullable
   public fkr<fjr> m;
   @Nullable
   public fkr<fjr> n;
   @Nullable
   public fkr<fjr> o;
   @Nullable
   public fkr<fjr> p;
   @Nullable
   public fkr<fjr> q;

   @Override
   public void a(alr $$0, fkr<fjr> $$1) {
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
   public fkr<fjr> a(alr $$0) {
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
      this.k = fkr.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
