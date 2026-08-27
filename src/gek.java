import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gek implements gea {
   protected final List<frw> a;
   protected final Map<ib, List<frw>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gbz f;
   protected final fsi g;
   protected final fsg h;

   public gek(List<frw> $$0, Map<ib, List<frw>> $$1, boolean $$2, boolean $$3, boolean $$4, gbz $$5, fsi $$6, fsg $$7) {
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
   public List<frw> a(@Nullable dhn $$0, @Nullable ib $$1, atw $$2) {
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
   public gbz e() {
      return this.f;
   }

   @Override
   public fsi f() {
      return this.g;
   }

   @Override
   public fsg g() {
      return this.h;
   }

   public static class a {
      private final List<frw> a = Lists.newArrayList();
      private final Map<ib, List<frw>> b = Maps.newEnumMap(ib.class);
      private final fsg c;
      private final boolean d;
      private gbz e;
      private final boolean f;
      private final boolean g;
      private final fsi h;

      public a(fsb $$0, fsg $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fsi $$3, fsg $$4) {
         for (ib $$5 : ib.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gek.a a(ib $$0, frw $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gek.a a(frw $$0) {
         this.a.add($$0);
         return this;
      }

      public gek.a a(gbz $$0) {
         this.e = $$0;
         return this;
      }

      public gek.a a() {
         return this;
      }

      public gea b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gek(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
