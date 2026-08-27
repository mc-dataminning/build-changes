import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gtj implements gsz {
   protected final List<ggd> a;
   protected final Map<iw, List<ggd>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gqy f;
   protected final ggp g;
   protected final ggn h;

   public gtj(List<ggd> $$0, Map<iw, List<ggd>> $$1, boolean $$2, boolean $$3, boolean $$4, gqy $$5, ggp $$6, ggn $$7) {
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
   public List<ggd> a(@Nullable dtc $$0, @Nullable iw $$1, ayt $$2) {
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
   public gqy e() {
      return this.f;
   }

   @Override
   public ggp f() {
      return this.g;
   }

   @Override
   public ggn g() {
      return this.h;
   }

   public static class a {
      private final List<ggd> a = Lists.newArrayList();
      private final Map<iw, List<ggd>> b = Maps.newEnumMap(iw.class);
      private final ggn c;
      private final boolean d;
      private gqy e;
      private final boolean f;
      private final boolean g;
      private final ggp h;

      public a(ggi $$0, ggn $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, ggp $$3, ggn $$4) {
         for (iw $$5 : iw.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gtj.a a(iw $$0, ggd $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gtj.a a(ggd $$0) {
         this.a.add($$0);
         return this;
      }

      public gtj.a a(gqy $$0) {
         this.e = $$0;
         return this;
      }

      public gtj.a a() {
         return this;
      }

      public gsz b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gtj(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
