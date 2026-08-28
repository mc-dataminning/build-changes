import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gsx implements gsm {
   protected final List<gfw> a;
   protected final Map<ji, List<gfw>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gql f;
   protected final ggi g;
   protected final ggg h;

   public gsx(List<gfw> $$0, Map<ji, List<gfw>> $$1, boolean $$2, boolean $$3, boolean $$4, gql $$5, ggi $$6, ggg $$7) {
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
   public List<gfw> a(@Nullable dtc $$0, @Nullable ji $$1, ayw $$2) {
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
   public gql e() {
      return this.f;
   }

   @Override
   public ggi f() {
      return this.g;
   }

   @Override
   public ggg g() {
      return this.h;
   }

   public static class a {
      private final List<gfw> a = Lists.newArrayList();
      private final Map<ji, List<gfw>> b = Maps.newEnumMap(ji.class);
      private final ggg c;
      private final boolean d;
      private gql e;
      private final boolean f;
      private final boolean g;
      private final ggi h;

      public a(ggb $$0, ggg $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, ggi $$3, ggg $$4) {
         for (ji $$5 : ji.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gsx.a a(ji $$0, gfw $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gsx.a a(gfw $$0) {
         this.a.add($$0);
         return this;
      }

      public gsx.a a(gql $$0) {
         this.e = $$0;
         return this;
      }

      public gsx.a a() {
         return this;
      }

      public gsm b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gsx(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
