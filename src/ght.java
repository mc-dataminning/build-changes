import java.util.Set;
import javax.annotation.Nullable;

public class ght implements gia.a {
   public static final alh a = gia.a;
   public static final alh b = alh.b("translucent");
   public static final alh c = alh.b("item_entity");
   public static final alh d = alh.b("particles");
   public static final alh e = alh.b("weather");
   public static final alh f = alh.b("clouds");
   public static final alh g = alh.b("entity_outline");
   public static final Set<alh> h = Set.of(a);
   public static final Set<alh> i = Set.of(a, g);
   public static final Set<alh> j = Set.of(a, b, c, d, e, f);
   public fdf<fcd> k = fdf.a();
   @Nullable
   public fdf<fcd> l;
   @Nullable
   public fdf<fcd> m;
   @Nullable
   public fdf<fcd> n;
   @Nullable
   public fdf<fcd> o;
   @Nullable
   public fdf<fcd> p;
   @Nullable
   public fdf<fcd> q;

   @Override
   public void a(alh $$0, fdf<fcd> $$1) {
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
   public fdf<fcd> a(alh $$0) {
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
      this.k = fdf.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
