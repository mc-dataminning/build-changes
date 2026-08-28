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

public class grv {
   private final grs a;
   final grt b;
   private final gru c;
   private final Runnable d;
   private grv.c e;
   final List<grv.e> f = new ArrayList<>();

   public grv(grs $$0, grt $$1, gru $$2, Runnable $$3, grv.c $$4) {
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
      for (grv.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(grv.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == grv.c.c) {
         this.b.a($$0, grt.a.a);
      } else {
         this.a($$0, new grv.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == grv.c.c) {
         this.b.a($$0, grt.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         grv.e $$5 = new grv.e($$0, $$2, null);
         $$5.f = grv.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, grv.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == grv.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(grv.e $$0) {
      this.b.a($$0.a, grt.b.a);
      $$0.h = true;
   }

   @Nullable
   private grv.e c(UUID $$0) {
      for (grv.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      grv.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(grv.d.e);
         this.f();
      }
   }

   public void a() {
      for (grv.e $$0 : this.f) {
         $$0.a(grv.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = grv.c.b;

      for (grv.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = grv.c.c;

      for (grv.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(grv.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = grv.c.a;
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
         if ($$0.g != grv.a.a) {
            return false;
         } else if ($$0.e != null) {
            grt.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<grv.e> $$0, asw.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (grv.e $$2 : this.f) {
            if ($$2.g != grv.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(grv.d.a);
               } else {
                  $$2.a(grv.d.d);
               }
            }
         }
      }

      for (grv.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = grv.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, grt.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<grv.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (grv.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != grv.b.c) {
               $$1 = true;
            }

            if ($$2.f == grv.b.a) {
               $$2.f = grv.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asw.c> $$3 = new HashMap<>();

         for (grv.e $$4 : $$0) {
            $$3.put($$4.a, new asw.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<grv.e> $$1 = new ArrayList<>();
      final List<grv.e> $$2 = new ArrayList<>();

      for (grv.e $$3 : this.f) {
         if ($$3.g == grv.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == grv.b.c && !$$3.a();
         if ($$4 && $$3.g == grv.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == grv.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (grv.e $$5 : $$1) {
            if ($$5.g != grv.a.c) {
               $$5.g = grv.a.b;
            }
         }

         for (grv.e $$6 : $$2) {
            $$6.g = grv.a.b;
         }

         this.c.scheduleReload(new gru.a() {
            @Override
            public void a() {
               for (grv.e $$0 : $$1) {
                  $$0.g = grv.a.c;
                  if ($$0.e == null) {
                     grv.this.b.a($$0.a, grt.a.b);
                  }
               }

               for (grv.e $$1 : $$2) {
                  $$1.g = grv.a.a;
               }

               grv.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (grv.e $$1 : grv.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(grv.d.d);
                           break;
                        case b:
                           $$1.g = grv.a.a;
                           $$1.a(grv.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  grv.this.f();
               } else {
                  for (grv.e $$2 : grv.this.f) {
                     if ($$2.g == grv.a.b) {
                        $$2.g = grv.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gru.b> b() {
               return $$1.stream().map($$0 -> new gru.b($$0.a, $$0.d)).toList();
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
      a(grt.a.d),
      b(grt.a.e),
      c(grt.a.a),
      d(grt.a.c),
      e(null),
      f(null);

      @Nullable
      final grt.a g;

      private d(@Nullable final grt.a $$0) {
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
      grv.d e;
      grv.b f = grv.b.a;
      grv.a g = grv.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(grv.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
