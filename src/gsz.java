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

public class gsz {
   private final gsw a;
   final gsx b;
   private final gsy c;
   private final Runnable d;
   private gsz.c e;
   final List<gsz.e> f = new ArrayList<>();

   public gsz(gsw $$0, gsx $$1, gsy $$2, Runnable $$3, gsz.c $$4) {
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
      for (gsz.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gsz.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gsz.c.c) {
         this.b.a($$0, gsx.a.a);
      } else {
         this.a($$0, new gsz.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gsz.c.c) {
         this.b.a($$0, gsx.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gsz.e $$5 = new gsz.e($$0, $$2, null);
         $$5.f = gsz.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gsz.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gsz.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gsz.e $$0) {
      this.b.a($$0.a, gsx.b.a);
      $$0.h = true;
   }

   @Nullable
   private gsz.e c(UUID $$0) {
      for (gsz.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gsz.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gsz.d.e);
         this.f();
      }
   }

   public void a() {
      for (gsz.e $$0 : this.f) {
         $$0.a(gsz.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gsz.c.b;

      for (gsz.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gsz.c.c;

      for (gsz.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gsz.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gsz.c.a;
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
         if ($$0.g != gsz.a.a) {
            return false;
         } else if ($$0.e != null) {
            gsx.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gsz.e> $$0, ask.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gsz.e $$2 : this.f) {
            if ($$2.g != gsz.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gsz.d.a);
               } else {
                  $$2.a(gsz.d.d);
               }
            }
         }
      }

      for (gsz.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gsz.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gsx.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gsz.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gsz.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gsz.b.c) {
               $$1 = true;
            }

            if ($$2.f == gsz.b.a) {
               $$2.f = gsz.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, ask.c> $$3 = new HashMap<>();

         for (gsz.e $$4 : $$0) {
            $$3.put($$4.a, new ask.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gsz.e> $$1 = new ArrayList<>();
      final List<gsz.e> $$2 = new ArrayList<>();

      for (gsz.e $$3 : this.f) {
         if ($$3.g == gsz.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gsz.b.c && !$$3.a();
         if ($$4 && $$3.g == gsz.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gsz.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gsz.e $$5 : $$1) {
            if ($$5.g != gsz.a.c) {
               $$5.g = gsz.a.b;
            }
         }

         for (gsz.e $$6 : $$2) {
            $$6.g = gsz.a.b;
         }

         this.c.scheduleReload(new gsy.a() {
            @Override
            public void a() {
               for (gsz.e $$0 : $$1) {
                  $$0.g = gsz.a.c;
                  if ($$0.e == null) {
                     gsz.this.b.a($$0.a, gsx.a.b);
                  }
               }

               for (gsz.e $$1 : $$2) {
                  $$1.g = gsz.a.a;
               }

               gsz.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gsz.e $$1 : gsz.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gsz.d.d);
                           break;
                        case b:
                           $$1.g = gsz.a.a;
                           $$1.a(gsz.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gsz.this.f();
               } else {
                  for (gsz.e $$2 : gsz.this.f) {
                     if ($$2.g == gsz.a.b) {
                        $$2.g = gsz.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gsy.b> b() {
               return $$1.stream().map($$0 -> new gsy.b($$0.a, $$0.d)).toList();
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
      a(gsx.a.d),
      b(gsx.a.e),
      c(gsx.a.a),
      d(gsx.a.c),
      e(null),
      f(null);

      @Nullable
      final gsx.a g;

      private d(@Nullable final gsx.a $$0) {
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
      gsz.d e;
      gsz.b f = gsz.b.a;
      gsz.a g = gsz.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gsz.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
