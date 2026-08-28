import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class grt {
   private final grq a;
   final grr b;
   private final grs c;
   private final Runnable d;
   private grt.c e;
   final List<grt.e> f = new ArrayList<>();

   public grt(grq $$0, grr $$1, grs $$2, Runnable $$3, grt.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   void f() {
      this.d.run();
   }

   private void b(UUID $$0) {
      for (grt.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(grt.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == grt.c.c) {
         this.b.a($$0, grr.a.a);
      } else {
         this.a($$0, new grt.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == grt.c.c) {
         this.b.a($$0, grr.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         grt.e $$5 = new grt.e($$0, $$2, null);
         $$5.f = grt.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, grt.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == grt.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(grt.e $$0) {
      this.b.a($$0.a, grr.b.a);
      $$0.h = true;
   }

   @Nullable
   private grt.e c(UUID $$0) {
      for (grt.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      grt.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(grt.d.e);
         this.f();
      }
   }

   public void a() {
      for (grt.e $$0 : this.f) {
         $$0.a(grt.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = grt.c.b;

      for (grt.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = grt.c.c;

      for (grt.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(grt.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = grt.c.a;
   }

   public void e() {
      boolean $$0 = this.h();
      if (!$$0) {
         this.i();
      }

      this.g();
   }

   private void g() {
      this.f.removeIf($$0 -> {
         if ($$0.g != grt.a.a) {
            return false;
         } else if ($$0.e != null) {
            grr.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<grt.e> $$0, asw.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (grt.e $$2 : this.f) {
            if ($$2.g != grt.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(grt.d.a);
               } else {
                  $$2.a(grt.d.d);
               }
            }
         }
      }

      for (grt.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = grt.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, grr.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<grt.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (grt.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != grt.b.c) {
               $$1 = true;
            }

            if ($$2.f == grt.b.a) {
               $$2.f = grt.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asw.c> $$3 = new HashMap<>();

         for (grt.e $$4 : $$0) {
            $$3.put($$4.a, new asw.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<grt.e> $$1 = new ArrayList<>();
      final List<grt.e> $$2 = new ArrayList<>();

      for (grt.e $$3 : this.f) {
         if ($$3.g == grt.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == grt.b.c && !$$3.a();
         if ($$4 && $$3.g == grt.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == grt.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (grt.e $$5 : $$1) {
            if ($$5.g != grt.a.c) {
               $$5.g = grt.a.b;
            }
         }

         for (grt.e $$6 : $$2) {
            $$6.g = grt.a.b;
         }

         this.c.scheduleReload(new grs.a() {
            @Override
            public void a() {
               for (grt.e $$0 : $$1) {
                  $$0.g = grt.a.c;
                  if ($$0.e == null) {
                     grt.this.b.a($$0.a, grr.a.b);
                  }
               }

               for (grt.e $$1 : $$2) {
                  $$1.g = grt.a.a;
               }

               grt.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (grt.e $$1 : grt.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(grt.d.d);
                           break;
                        case b:
                           $$1.g = grt.a.a;
                           $$1.a(grt.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  grt.this.f();
               } else {
                  for (grt.e $$2 : grt.this.f) {
                     if ($$2.g == grt.a.b) {
                        $$2.g = grt.a.a;
                     }
                  }
               }
            }

            @Override
            public List<grs.b> b() {
               return $$1.stream().map($$0 -> new grs.b($$0.a, $$0.d)).toList();
            }
         });
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }

   public static enum c {
      a,
      b,
      c;
   }

   static enum d {
      a(grr.a.d),
      b(grr.a.e),
      c(grr.a.a),
      d(grr.a.c),
      e(null),
      f(null);

      @Nullable
      final grr.a g;

      private d(@Nullable final grr.a $$0) {
         this.g = $$0;
      }
   }

   static class e {
      final UUID a;
      final URL b;
      @Nullable
      final HashCode c;
      @Nullable
      Path d;
      @Nullable
      grt.d e;
      grt.b f = grt.b.a;
      grt.a g = grt.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(grt.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
