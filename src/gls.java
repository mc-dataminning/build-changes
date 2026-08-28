import java.util.Set;
import javax.annotation.Nullable;

public class gls implements glz.a {
   public static final aku a = glz.a;
   public static final aku b = aku.b("translucent");
   public static final aku c = aku.b("item_entity");
   public static final aku d = aku.b("particles");
   public static final aku e = aku.b("weather");
   public static final aku f = aku.b("clouds");
   public static final aku g = aku.b("entity_outline");
   public static final Set<aku> h = Set.of(a);
   public static final Set<aku> i = Set.of(a, g);
   public static final Set<aku> j = Set.of(a, b, c, d, e, f);
   public ffe<fec> k = ffe.a();
   @Nullable
   public ffe<fec> l;
   @Nullable
   public ffe<fec> m;
   @Nullable
   public ffe<fec> n;
   @Nullable
   public ffe<fec> o;
   @Nullable
   public ffe<fec> p;
   @Nullable
   public ffe<fec> q;

   @Override
   public void a(aku $$0, ffe<fec> $$1) {
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
   public ffe<fec> a(aku $$0) {
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
      this.k = ffe.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
