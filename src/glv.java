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

public class glv {
   private final gls a;
   final glt b;
   private final glu c;
   private final Runnable d;
   private glv.c e;
   final List<glv.e> f = new ArrayList<>();

   public glv(gls $$0, glt $$1, glu $$2, Runnable $$3, glv.c $$4) {
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
      for (glv.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(glv.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == glv.c.c) {
         this.b.a($$0, glt.a.a);
      } else {
         this.a($$0, new glv.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == glv.c.c) {
         this.b.a($$0, glt.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         glv.e $$5 = new glv.e($$0, $$2, null);
         $$5.f = glv.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, glv.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == glv.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(glv.e $$0) {
      this.b.a($$0.a, glt.b.a);
      $$0.h = true;
   }

   @Nullable
   private glv.e c(UUID $$0) {
      for (glv.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      glv.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(glv.d.e);
         this.f();
      }
   }

   public void a() {
      for (glv.e $$0 : this.f) {
         $$0.a(glv.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = glv.c.b;

      for (glv.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = glv.c.c;

      for (glv.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(glv.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = glv.c.a;
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
         if ($$0.g != glv.a.a) {
            return false;
         } else if ($$0.e != null) {
            glt.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<glv.e> $$0, aqv.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (glv.e $$2 : this.f) {
            if ($$2.g != glv.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(glv.d.a);
               } else {
                  $$2.a(glv.d.d);
               }
            }
         }
      }

      for (glv.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = glv.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, glt.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<glv.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (glv.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != glv.b.c) {
               $$1 = true;
            }

            if ($$2.f == glv.b.a) {
               $$2.f = glv.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aqv.c> $$3 = new HashMap<>();

         for (glv.e $$4 : $$0) {
            $$3.put($$4.a, new aqv.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<glv.e> $$1 = new ArrayList<>();
      final List<glv.e> $$2 = new ArrayList<>();

      for (glv.e $$3 : this.f) {
         if ($$3.g == glv.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == glv.b.c && !$$3.a();
         if ($$4 && $$3.g == glv.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == glv.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (glv.e $$5 : $$1) {
            if ($$5.g != glv.a.c) {
               $$5.g = glv.a.b;
            }
         }

         for (glv.e $$6 : $$2) {
            $$6.g = glv.a.b;
         }

         this.c.scheduleReload(new glu.a() {
            @Override
            public void a() {
               for (glv.e $$0 : $$1) {
                  $$0.g = glv.a.c;
                  if ($$0.e == null) {
                     glv.this.b.a($$0.a, glt.a.b);
                  }
               }

               for (glv.e $$1 : $$2) {
                  $$1.g = glv.a.a;
               }

               glv.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (glv.e $$1 : glv.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = glv.a.a;
                           $$1.a(glv.d.b);
                           break;
                        case a:
                           $$1.a(glv.d.d);
                     }
                  }

                  glv.this.f();
               } else {
                  for (glv.e $$2 : glv.this.f) {
                     if ($$2.g == glv.a.b) {
                        $$2.g = glv.a.a;
                     }
                  }
               }
            }

            @Override
            public List<glu.b> b() {
               return $$1.stream().map($$0 -> new glu.b($$0.a, $$0.d)).toList();
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
      a(glt.a.d),
      b(glt.a.e),
      c(glt.a.a),
      d(glt.a.c),
      e(null),
      f(null);

      @Nullable
      final glt.a g;

      private d(@Nullable glt.a $$0) {
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
      glv.d e;
      glv.b f = glv.b.a;
      glv.a g = glv.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(glv.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
