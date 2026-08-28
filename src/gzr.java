import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gzr implements gzd {
   protected final List<gim> a;
   protected final Map<jj, List<gim>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gxb f;
   protected final giy g;
   protected final giw h;

   public gzr(List<gim> $$0, Map<jj, List<gim>> $$1, boolean $$2, boolean $$3, boolean $$4, gxb $$5, giy $$6, giw $$7) {
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
   public List<gim> a(@Nullable duo $$0, @Nullable jj $$1, azl $$2) {
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
   public gxb e() {
      return this.f;
   }

   @Override
   public giy f() {
      return this.g;
   }

   @Override
   public giw g() {
      return this.h;
   }

   public static class a {
      private final Builder<gim> a = ImmutableList.builder();
      private final EnumMap<jj, Builder<gim>> b = Maps.newEnumMap(jj.class);
      private final giw c;
      private final boolean d;
      @Nullable
      private gxb e;
      private final boolean f;
      private final boolean g;
      private final giy h;

      public a(gir $$0, giw $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.g(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, giy $$3, giw $$4) {
         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;

         for (jj $$5 : jj.values()) {
            this.b.put($$5, ImmutableList.builder());
         }
      }

      public gzr.a a(jj $$0, gim $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gzr.a a(gim $$0) {
         this.a.add($$0);
         return this;
      }

      public gzr.a a(gxb $$0) {
         this.e = $$0;
         return this;
      }

      public gzr.a a() {
         return this;
      }

      public gzd b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jj, List<gim>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new gzr(this.a.build(), new EnumMap<>($$0), this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
