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

public class gqp {
   private final gqm a;
   final gqn b;
   private final gqo c;
   private final Runnable d;
   private gqp.c e;
   final List<gqp.e> f = new ArrayList<>();

   public gqp(gqm $$0, gqn $$1, gqo $$2, Runnable $$3, gqp.c $$4) {
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
      for (gqp.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gqp.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gqp.c.c) {
         this.b.a($$0, gqn.a.a);
      } else {
         this.a($$0, new gqp.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gqp.c.c) {
         this.b.a($$0, gqn.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gqp.e $$5 = new gqp.e($$0, $$2, null);
         $$5.f = gqp.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gqp.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gqp.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gqp.e $$0) {
      this.b.a($$0.a, gqn.b.a);
      $$0.h = true;
   }

   @Nullable
   private gqp.e c(UUID $$0) {
      for (gqp.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gqp.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gqp.d.e);
         this.f();
      }
   }

   public void a() {
      for (gqp.e $$0 : this.f) {
         $$0.a(gqp.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gqp.c.b;

      for (gqp.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gqp.c.c;

      for (gqp.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gqp.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gqp.c.a;
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
         if ($$0.g != gqp.a.a) {
            return false;
         } else if ($$0.e != null) {
            gqn.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gqp.e> $$0, asd.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gqp.e $$2 : this.f) {
            if ($$2.g != gqp.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gqp.d.a);
               } else {
                  $$2.a(gqp.d.d);
               }
            }
         }
      }

      for (gqp.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gqp.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gqn.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gqp.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gqp.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gqp.b.c) {
               $$1 = true;
            }

            if ($$2.f == gqp.b.a) {
               $$2.f = gqp.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asd.c> $$3 = new HashMap<>();

         for (gqp.e $$4 : $$0) {
            $$3.put($$4.a, new asd.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gqp.e> $$1 = new ArrayList<>();
      final List<gqp.e> $$2 = new ArrayList<>();

      for (gqp.e $$3 : this.f) {
         if ($$3.g == gqp.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gqp.b.c && !$$3.a();
         if ($$4 && $$3.g == gqp.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gqp.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gqp.e $$5 : $$1) {
            if ($$5.g != gqp.a.c) {
               $$5.g = gqp.a.b;
            }
         }

         for (gqp.e $$6 : $$2) {
            $$6.g = gqp.a.b;
         }

         this.c.scheduleReload(new gqo.a() {
            @Override
            public void a() {
               for (gqp.e $$0 : $$1) {
                  $$0.g = gqp.a.c;
                  if ($$0.e == null) {
                     gqp.this.b.a($$0.a, gqn.a.b);
                  }
               }

               for (gqp.e $$1 : $$2) {
                  $$1.g = gqp.a.a;
               }

               gqp.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gqp.e $$1 : gqp.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = gqp.a.a;
                           $$1.a(gqp.d.b);
                           break;
                        case a:
                           $$1.a(gqp.d.d);
                     }
                  }

                  gqp.this.f();
               } else {
                  for (gqp.e $$2 : gqp.this.f) {
                     if ($$2.g == gqp.a.b) {
                        $$2.g = gqp.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gqo.b> b() {
               return $$1.stream().map($$0 -> new gqo.b($$0.a, $$0.d)).toList();
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
      a(gqn.a.d),
      b(gqn.a.e),
      c(gqn.a.a),
      d(gqn.a.c),
      e(null),
      f(null);

      @Nullable
      final gqn.a g;

      private d(@Nullable gqn.a $$0) {
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
      gqp.d e;
      gqp.b f = gqp.b.a;
      gqp.a g = gqp.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gqp.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
