import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gar implements gah {
   protected final List<foc> a;
   protected final Map<hb, List<foc>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final fyg f;
   protected final foo g;
   protected final fom h;

   public gar(List<foc> $$0, Map<hb, List<foc>> $$1, boolean $$2, boolean $$3, boolean $$4, fyg $$5, foo $$6, fom $$7) {
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
   public List<foc> a(@Nullable dey $$0, @Nullable hb $$1, art $$2) {
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
   public fyg e() {
      return this.f;
   }

   @Override
   public foo f() {
      return this.g;
   }

   @Override
   public fom g() {
      return this.h;
   }

   public static class a {
      private final List<foc> a = Lists.newArrayList();
      private final Map<hb, List<foc>> b = Maps.newEnumMap(hb.class);
      private final fom c;
      private final boolean d;
      private fyg e;
      private final boolean f;
      private final boolean g;
      private final foo h;

      public a(foh $$0, fom $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, foo $$3, fom $$4) {
         for (hb $$5 : hb.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gar.a a(hb $$0, foc $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gar.a a(foc $$0) {
         this.a.add($$0);
         return this;
      }

      public gar.a a(fyg $$0) {
         this.e = $$0;
         return this;
      }

      public gar.a a() {
         return this;
      }

      public gah b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gar(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
