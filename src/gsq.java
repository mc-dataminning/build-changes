import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gsq implements gsg {
   protected final List<gfq> a;
   protected final Map<ji, List<gfq>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gqf f;
   protected final ggc g;
   protected final gga h;

   public gsq(List<gfq> $$0, Map<ji, List<gfq>> $$1, boolean $$2, boolean $$3, boolean $$4, gqf $$5, ggc $$6, gga $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public List<gfq> a(@Nullable dta $$0, @Nullable ji $$1, ayv $$2) {
      return $$1 == null ? this.a : this.b.get($$1);
   }

   @Override
   public boolean a() {
      return this.c;
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public boolean c() {
      return this.e;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public gqf e() {
      return this.f;
   }

   @Override
   public ggc f() {
      return this.g;
   }

   @Override
   public gga g() {
      return this.h;
   }

   public static class a {
      private final List<gfq> a = Lists.newArrayList();
      private final Map<ji, List<gfq>> b = Maps.newEnumMap(ji.class);
      private final gga c;
      private final boolean d;
      private gqf e;
      private final boolean f;
      private final boolean g;
      private final ggc h;

      public a(gfv $$0, gga $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, ggc $$3, gga $$4) {
         for (ji $$5 : ji.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gsq.a a(ji $$0, gfq $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gsq.a a(gfq $$0) {
         this.a.add($$0);
         return this;
      }

      public gsq.a a(gqf $$0) {
         this.e = $$0;
         return this;
      }

      public gsq.a a() {
         return this;
      }

      public gsg b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gsq(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
