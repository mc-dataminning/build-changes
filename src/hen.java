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

public class hen {
   private final hek a;
   final hel b;
   private final hem c;
   private final Runnable d;
   private hen.c e;
   final List<hen.e> f = new ArrayList<>();

   public hen(hek $$0, hel $$1, hem $$2, Runnable $$3, hen.c $$4) {
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
      for (hen.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hen.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hen.c.c) {
         this.b.a($$0, hel.a.a);
      } else {
         this.a($$0, new hen.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hen.c.c) {
         this.b.a($$0, hel.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hen.e $$5 = new hen.e($$0, $$2, null);
         $$5.f = hen.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hen.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hen.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hen.e $$0) {
      this.b.a($$0.a, hel.b.a);
      $$0.h = true;
   }

   @Nullable
   private hen.e c(UUID $$0) {
      for (hen.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hen.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hen.d.e);
         this.f();
      }
   }

   public void a() {
      for (hen.e $$0 : this.f) {
         $$0.a(hen.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hen.c.b;

      for (hen.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hen.c.c;

      for (hen.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hen.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hen.c.a;
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
         if ($$0.g != hen.a.a) {
            return false;
         } else if ($$0.e != null) {
            hel.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hen.e> $$0, aub.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hen.e $$2 : this.f) {
            if ($$2.g != hen.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hen.d.a);
               } else {
                  $$2.a(hen.d.d);
               }
            }
         }
      }

      for (hen.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hen.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hel.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hen.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hen.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hen.b.c) {
               $$1 = true;
            }

            if ($$2.f == hen.b.a) {
               $$2.f = hen.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aub.c> $$3 = new HashMap<>();

         for (hen.e $$4 : $$0) {
            $$3.put($$4.a, new aub.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hen.e> $$1 = new ArrayList<>();
      final List<hen.e> $$2 = new ArrayList<>();

      for (hen.e $$3 : this.f) {
         if ($$3.g == hen.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hen.b.c && !$$3.a();
         if ($$4 && $$3.g == hen.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hen.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hen.e $$5 : $$1) {
            if ($$5.g != hen.a.c) {
               $$5.g = hen.a.b;
            }
         }

         for (hen.e $$6 : $$2) {
            $$6.g = hen.a.b;
         }

         this.c.scheduleReload(new hem.a() {
            @Override
            public void a() {
               for (hen.e $$0 : $$1) {
                  $$0.g = hen.a.c;
                  if ($$0.e == null) {
                     hen.this.b.a($$0.a, hel.a.b);
                  }
               }

               for (hen.e $$1 : $$2) {
                  $$1.g = hen.a.a;
               }

               hen.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hen.e $$1 : hen.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hen.d.d);
                           break;
                        case b:
                           $$1.g = hen.a.a;
                           $$1.a(hen.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hen.this.f();
               } else {
                  for (hen.e $$2 : hen.this.f) {
                     if ($$2.g == hen.a.b) {
                        $$2.g = hen.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hem.b> b() {
               return $$1.stream().map($$0 -> new hem.b($$0.a, $$0.d)).toList();
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
      a(hel.a.d),
      b(hel.a.e),
      c(hel.a.a),
      d(hel.a.c),
      e(null),
      f(null);

      @Nullable
      final hel.a g;

      private d(@Nullable final hel.a $$0) {
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
      hen.d e;
      hen.b f = hen.b.a;
      hen.a g = hen.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hen.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
