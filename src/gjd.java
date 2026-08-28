import java.util.Set;
import javax.annotation.Nullable;

public class gjd implements gjk.a {
   public static final alj a = gjk.a;
   public static final alj b = alj.b("translucent");
   public static final alj c = alj.b("item_entity");
   public static final alj d = alj.b("particles");
   public static final alj e = alj.b("weather");
   public static final alj f = alj.b("clouds");
   public static final alj g = alj.b("entity_outline");
   public static final Set<alj> h = Set.of(a);
   public static final Set<alj> i = Set.of(a, g);
   public static final Set<alj> j = Set.of(a, b, c, d, e, f);
   public fed<fdb> k = fed.a();
   @Nullable
   public fed<fdb> l;
   @Nullable
   public fed<fdb> m;
   @Nullable
   public fed<fdb> n;
   @Nullable
   public fed<fdb> o;
   @Nullable
   public fed<fdb> p;
   @Nullable
   public fed<fdb> q;

   @Override
   public void a(alj $$0, fed<fdb> $$1) {
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
   public fed<fdb> a(alj $$0) {
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
      this.k = fed.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
