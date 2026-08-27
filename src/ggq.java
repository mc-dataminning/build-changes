import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ggq implements ggg {
   protected final List<ftw> a;
   protected final Map<ic, List<ftw>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gef f;
   protected final fui g;
   protected final fug h;

   public ggq(List<ftw> $$0, Map<ic, List<ftw>> $$1, boolean $$2, boolean $$3, boolean $$4, gef $$5, fui $$6, fug $$7) {
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
   public List<ftw> a(@Nullable dja $$0, @Nullable ic $$1, aup $$2) {
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
   public gef e() {
      return this.f;
   }

   @Override
   public fui f() {
      return this.g;
   }

   @Override
   public fug g() {
      return this.h;
   }

   public static class a {
      private final List<ftw> a = Lists.newArrayList();
      private final Map<ic, List<ftw>> b = Maps.newEnumMap(ic.class);
      private final fug c;
      private final boolean d;
      private gef e;
      private final boolean f;
      private final boolean g;
      private final fui h;

      public a(fub $$0, fug $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fui $$3, fug $$4) {
         for (ic $$5 : ic.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public ggq.a a(ic $$0, ftw $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public ggq.a a(ftw $$0) {
         this.a.add($$0);
         return this;
      }

      public ggq.a a(gef $$0) {
         this.e = $$0;
         return this;
      }

      public ggq.a a() {
         return this;
      }

      public ggg b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new ggq(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
