import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gkj implements gjz {
   protected final List<fxn> a;
   protected final Map<ih, List<fxn>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final ghz f;
   protected final fxz g;
   protected final fxx h;

   public gkj(List<fxn> $$0, Map<ih, List<fxn>> $$1, boolean $$2, boolean $$3, boolean $$4, ghz $$5, fxz $$6, fxx $$7) {
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
   public List<fxn> a(@Nullable dme $$0, @Nullable ih $$1, awt $$2) {
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
   public ghz e() {
      return this.f;
   }

   @Override
   public fxz f() {
      return this.g;
   }

   @Override
   public fxx g() {
      return this.h;
   }

   public static class a {
      private final List<fxn> a = Lists.newArrayList();
      private final Map<ih, List<fxn>> b = Maps.newEnumMap(ih.class);
      private final fxx c;
      private final boolean d;
      private ghz e;
      private final boolean f;
      private final boolean g;
      private final fxz h;

      public a(fxs $$0, fxx $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fxz $$3, fxx $$4) {
         for (ih $$5 : ih.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gkj.a a(ih $$0, fxn $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gkj.a a(fxn $$0) {
         this.a.add($$0);
         return this;
      }

      public gkj.a a(ghz $$0) {
         this.e = $$0;
         return this;
      }

      public gkj.a a() {
         return this;
      }

      public gjz b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gkj(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
