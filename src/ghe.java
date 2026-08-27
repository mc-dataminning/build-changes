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

public class ghe {
   private final ghb a;
   final ghc b;
   private final ghd c;
   private final Runnable d;
   private ghe.c e;
   final List<ghe.e> f = new ArrayList<>();

   public ghe(ghb $$0, ghc $$1, ghd $$2, Runnable $$3, ghe.c $$4) {
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
      for (ghe.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(ghe.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == ghe.c.c) {
         this.b.sendResponse($$0, ghc.a.b);
      } else {
         this.a($$0, new ghe.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == ghe.c.c) {
         this.b.sendResponse($$0, ghc.a.b);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         ghe.e $$5 = new ghe.e($$0, $$2, null);
         $$5.f = ghe.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, ghe.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == ghe.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(ghe.e $$0) {
      this.b.sendResponse($$0.a, ghc.a.a);
      $$0.h = true;
   }

   @Nullable
   private ghe.e c(UUID $$0) {
      for (ghe.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      ghe.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(ghe.d.e);
         this.f();
      }
   }

   public void a() {
      for (ghe.e $$0 : this.f) {
         $$0.a(ghe.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = ghe.c.b;

      for (ghe.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = ghe.c.c;

      for (ghe.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(ghe.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = ghe.c.a;
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
         if ($$0.g != ghe.a.a) {
            return false;
         } else if ($$0.e != null) {
            ghc.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.sendResponse($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<ghe.e> $$0, aor.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (ghe.e $$2 : this.f) {
            if ($$2.g != ghe.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(ghe.d.a);
               } else {
                  $$2.a(ghe.d.d);
               }
            }
         }
      }

      for (ghe.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = ghe.b.c;
            $$3.d = $$4;
         }
      }

      this.f();
   }

   private boolean h() {
      List<ghe.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (ghe.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != ghe.b.c) {
               $$1 = true;
            }

            if ($$2.f == ghe.b.a) {
               $$2.f = ghe.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aor.c> $$3 = new HashMap<>();

         for (ghe.e $$4 : $$0) {
            $$3.put($$4.a, new aor.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<ghe.e> $$1 = new ArrayList<>();
      final List<ghe.e> $$2 = new ArrayList<>();

      for (ghe.e $$3 : this.f) {
         if ($$3.g == ghe.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == ghe.b.c && !$$3.a();
         if ($$4 && $$3.g == ghe.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == ghe.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (ghe.e $$5 : $$1) {
            if ($$5.g != ghe.a.c) {
               $$5.g = ghe.a.b;
            }
         }

         for (ghe.e $$6 : $$2) {
            $$6.g = ghe.a.b;
         }

         this.c.scheduleReload(new ghd.a() {
            @Override
            public void a() {
               for (ghe.e $$0 : $$1) {
                  $$0.g = ghe.a.c;
                  if ($$0.e == null) {
                     ghe.this.b.sendResponse($$0.a, ghc.a.c);
                  }
               }

               for (ghe.e $$1 : $$2) {
                  $$1.g = ghe.a.a;
               }

               ghe.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (ghe.e $$1 : ghe.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = ghe.a.a;
                           $$1.a(ghe.d.b);
                           break;
                        case a:
                           $$1.a(ghe.d.d);
                     }
                  }

                  ghe.this.f();
               } else {
                  for (ghe.e $$2 : ghe.this.f) {
                     if ($$2.g == ghe.a.b) {
                        $$2.g = ghe.a.a;
                     }
                  }
               }
            }

            @Override
            public List<ghd.b> b() {
               return $$1.stream().map($$0 -> new ghd.b($$0.a, $$0.d)).toList();
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
      a(ghc.a.e),
      b(ghc.a.f),
      c(ghc.a.b),
      d(ghc.a.d),
      e(null),
      f(null);

      @Nullable
      final ghc.a g;

      private d(@Nullable ghc.a $$0) {
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
      ghe.d e;
      ghe.b f = ghe.b.a;
      ghe.a g = ghe.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(ghe.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
