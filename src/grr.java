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

public class grr {
   private final gro a;
   final grp b;
   private final grq c;
   private final Runnable d;
   private grr.c e;
   final List<grr.e> f = new ArrayList<>();

   public grr(gro $$0, grp $$1, grq $$2, Runnable $$3, grr.c $$4) {
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
      for (grr.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(grr.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == grr.c.c) {
         this.b.a($$0, grp.a.a);
      } else {
         this.a($$0, new grr.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == grr.c.c) {
         this.b.a($$0, grp.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         grr.e $$5 = new grr.e($$0, $$2, null);
         $$5.f = grr.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, grr.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == grr.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(grr.e $$0) {
      this.b.a($$0.a, grp.b.a);
      $$0.h = true;
   }

   @Nullable
   private grr.e c(UUID $$0) {
      for (grr.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      grr.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(grr.d.e);
         this.f();
      }
   }

   public void a() {
      for (grr.e $$0 : this.f) {
         $$0.a(grr.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = grr.c.b;

      for (grr.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = grr.c.c;

      for (grr.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(grr.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = grr.c.a;
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
         if ($$0.g != grr.a.a) {
            return false;
         } else if ($$0.e != null) {
            grp.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<grr.e> $$0, asv.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (grr.e $$2 : this.f) {
            if ($$2.g != grr.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(grr.d.a);
               } else {
                  $$2.a(grr.d.d);
               }
            }
         }
      }

      for (grr.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = grr.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, grp.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<grr.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (grr.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != grr.b.c) {
               $$1 = true;
            }

            if ($$2.f == grr.b.a) {
               $$2.f = grr.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asv.c> $$3 = new HashMap<>();

         for (grr.e $$4 : $$0) {
            $$3.put($$4.a, new asv.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<grr.e> $$1 = new ArrayList<>();
      final List<grr.e> $$2 = new ArrayList<>();

      for (grr.e $$3 : this.f) {
         if ($$3.g == grr.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == grr.b.c && !$$3.a();
         if ($$4 && $$3.g == grr.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == grr.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (grr.e $$5 : $$1) {
            if ($$5.g != grr.a.c) {
               $$5.g = grr.a.b;
            }
         }

         for (grr.e $$6 : $$2) {
            $$6.g = grr.a.b;
         }

         this.c.scheduleReload(new grq.a() {
            @Override
            public void a() {
               for (grr.e $$0 : $$1) {
                  $$0.g = grr.a.c;
                  if ($$0.e == null) {
                     grr.this.b.a($$0.a, grp.a.b);
                  }
               }

               for (grr.e $$1 : $$2) {
                  $$1.g = grr.a.a;
               }

               grr.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (grr.e $$1 : grr.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(grr.d.d);
                           break;
                        case b:
                           $$1.g = grr.a.a;
                           $$1.a(grr.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  grr.this.f();
               } else {
                  for (grr.e $$2 : grr.this.f) {
                     if ($$2.g == grr.a.b) {
                        $$2.g = grr.a.a;
                     }
                  }
               }
            }

            @Override
            public List<grq.b> b() {
               return $$1.stream().map($$0 -> new grq.b($$0.a, $$0.d)).toList();
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
      a(grp.a.d),
      b(grp.a.e),
      c(grp.a.a),
      d(grp.a.c),
      e(null),
      f(null);

      @Nullable
      final grp.a g;

      private d(@Nullable final grp.a $$0) {
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
      grr.d e;
      grr.b f = grr.b.a;
      grr.a g = grr.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(grr.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
