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

public class ghg {
   private final ghd a;
   final ghe b;
   private final ghf c;
   private final Runnable d;
   private ghg.c e;
   final List<ghg.e> f = new ArrayList<>();

   public ghg(ghd $$0, ghe $$1, ghf $$2, Runnable $$3, ghg.c $$4) {
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
      for (ghg.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(ghg.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == ghg.c.c) {
         this.b.a($$0, ghe.a.a);
      } else {
         this.a($$0, new ghg.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == ghg.c.c) {
         this.b.a($$0, ghe.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         ghg.e $$5 = new ghg.e($$0, $$2, null);
         $$5.f = ghg.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, ghg.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == ghg.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(ghg.e $$0) {
      this.b.a($$0.a, ghe.b.a);
      $$0.h = true;
   }

   @Nullable
   private ghg.e c(UUID $$0) {
      for (ghg.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      ghg.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(ghg.d.e);
         this.f();
      }
   }

   public void a() {
      for (ghg.e $$0 : this.f) {
         $$0.a(ghg.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = ghg.c.b;

      for (ghg.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = ghg.c.c;

      for (ghg.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(ghg.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = ghg.c.a;
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
         if ($$0.g != ghg.a.a) {
            return false;
         } else if ($$0.e != null) {
            ghe.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<ghg.e> $$0, aos.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (ghg.e $$2 : this.f) {
            if ($$2.g != ghg.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(ghg.d.a);
               } else {
                  $$2.a(ghg.d.d);
               }
            }
         }
      }

      for (ghg.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = ghg.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, ghe.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<ghg.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (ghg.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != ghg.b.c) {
               $$1 = true;
            }

            if ($$2.f == ghg.b.a) {
               $$2.f = ghg.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aos.c> $$3 = new HashMap<>();

         for (ghg.e $$4 : $$0) {
            $$3.put($$4.a, new aos.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<ghg.e> $$1 = new ArrayList<>();
      final List<ghg.e> $$2 = new ArrayList<>();

      for (ghg.e $$3 : this.f) {
         if ($$3.g == ghg.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == ghg.b.c && !$$3.a();
         if ($$4 && $$3.g == ghg.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == ghg.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (ghg.e $$5 : $$1) {
            if ($$5.g != ghg.a.c) {
               $$5.g = ghg.a.b;
            }
         }

         for (ghg.e $$6 : $$2) {
            $$6.g = ghg.a.b;
         }

         this.c.scheduleReload(new ghf.a() {
            @Override
            public void a() {
               for (ghg.e $$0 : $$1) {
                  $$0.g = ghg.a.c;
                  if ($$0.e == null) {
                     ghg.this.b.a($$0.a, ghe.a.b);
                  }
               }

               for (ghg.e $$1 : $$2) {
                  $$1.g = ghg.a.a;
               }

               ghg.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (ghg.e $$1 : ghg.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = ghg.a.a;
                           $$1.a(ghg.d.b);
                           break;
                        case a:
                           $$1.a(ghg.d.d);
                     }
                  }

                  ghg.this.f();
               } else {
                  for (ghg.e $$2 : ghg.this.f) {
                     if ($$2.g == ghg.a.b) {
                        $$2.g = ghg.a.a;
                     }
                  }
               }
            }

            @Override
            public List<ghf.b> b() {
               return $$1.stream().map($$0 -> new ghf.b($$0.a, $$0.d)).toList();
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
      a(ghe.a.d),
      b(ghe.a.e),
      c(ghe.a.a),
      d(ghe.a.c),
      e(null),
      f(null);

      @Nullable
      final ghe.a g;

      private d(@Nullable ghe.a $$0) {
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
      ghg.d e;
      ghg.b f = ghg.b.a;
      ghg.a g = ghg.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(ghg.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
