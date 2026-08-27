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

public class ghf {
   private final ghc a;
   final ghd b;
   private final ghe c;
   private final Runnable d;
   private ghf.c e;
   final List<ghf.e> f = new ArrayList<>();

   public ghf(ghc $$0, ghd $$1, ghe $$2, Runnable $$3, ghf.c $$4) {
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
      for (ghf.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(ghf.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == ghf.c.c) {
         this.b.sendResponse($$0, ghd.a.b);
      } else {
         this.a($$0, new ghf.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == ghf.c.c) {
         this.b.sendResponse($$0, ghd.a.b);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         ghf.e $$5 = new ghf.e($$0, $$2, null);
         $$5.f = ghf.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, ghf.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == ghf.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(ghf.e $$0) {
      this.b.sendResponse($$0.a, ghd.a.a);
      $$0.h = true;
   }

   @Nullable
   private ghf.e c(UUID $$0) {
      for (ghf.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      ghf.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(ghf.d.e);
         this.f();
      }
   }

   public void a() {
      for (ghf.e $$0 : this.f) {
         $$0.a(ghf.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = ghf.c.b;

      for (ghf.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = ghf.c.c;

      for (ghf.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(ghf.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = ghf.c.a;
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
         if ($$0.g != ghf.a.a) {
            return false;
         } else if ($$0.e != null) {
            ghd.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.sendResponse($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<ghf.e> $$0, aor.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (ghf.e $$2 : this.f) {
            if ($$2.g != ghf.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(ghf.d.a);
               } else {
                  $$2.a(ghf.d.d);
               }
            }
         }
      }

      for (ghf.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = ghf.b.c;
            $$3.d = $$4;
         }
      }

      this.f();
   }

   private boolean h() {
      List<ghf.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (ghf.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != ghf.b.c) {
               $$1 = true;
            }

            if ($$2.f == ghf.b.a) {
               $$2.f = ghf.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aor.c> $$3 = new HashMap<>();

         for (ghf.e $$4 : $$0) {
            $$3.put($$4.a, new aor.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<ghf.e> $$1 = new ArrayList<>();
      final List<ghf.e> $$2 = new ArrayList<>();

      for (ghf.e $$3 : this.f) {
         if ($$3.g == ghf.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == ghf.b.c && !$$3.a();
         if ($$4 && $$3.g == ghf.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == ghf.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (ghf.e $$5 : $$1) {
            if ($$5.g != ghf.a.c) {
               $$5.g = ghf.a.b;
            }
         }

         for (ghf.e $$6 : $$2) {
            $$6.g = ghf.a.b;
         }

         this.c.scheduleReload(new ghe.a() {
            @Override
            public void a() {
               for (ghf.e $$0 : $$1) {
                  $$0.g = ghf.a.c;
                  if ($$0.e == null) {
                     ghf.this.b.sendResponse($$0.a, ghd.a.c);
                  }
               }

               for (ghf.e $$1 : $$2) {
                  $$1.g = ghf.a.a;
               }

               ghf.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (ghf.e $$1 : ghf.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = ghf.a.a;
                           $$1.a(ghf.d.b);
                           break;
                        case a:
                           $$1.a(ghf.d.d);
                     }
                  }

                  ghf.this.f();
               } else {
                  for (ghf.e $$2 : ghf.this.f) {
                     if ($$2.g == ghf.a.b) {
                        $$2.g = ghf.a.a;
                     }
                  }
               }
            }

            @Override
            public List<ghe.b> b() {
               return $$1.stream().map($$0 -> new ghe.b($$0.a, $$0.d)).toList();
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
      a(ghd.a.e),
      b(ghd.a.f),
      c(ghd.a.b),
      d(ghd.a.d),
      e(null),
      f(null);

      @Nullable
      final ghd.a g;

      private d(@Nullable ghd.a $$0) {
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
      ghf.d e;
      ghf.b f = ghf.b.a;
      ghf.a g = ghf.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(ghf.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
