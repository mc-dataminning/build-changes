import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gbj implements zr {
   private static final xe l = xe.c("disconnect.lost");
   private static final Logger m = LogUtils.getLogger();
   protected final fip a;
   protected final vy b;
   @Nullable
   protected final gca c;
   @Nullable
   protected String d;
   protected final hcs e;
   @Nullable
   protected final fqh f;
   protected boolean g;
   @Deprecated(
      forRemoval = true
   )
   protected final boolean h;
   private final List<gbj.a> n = new ArrayList<>();
   protected final Map<ale, byte[]> i;
   protected Map<String, String> j;
   protected alw k;

   protected gbj(fip $$0, vy $$1, gbq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.i = $$2.h();
      this.h = $$2.j();
      this.j = $$2.k();
      this.k = $$2.l();
   }

   @Override
   public void a(zl $$0, Exception $$1) {
      m.error("Failed to handle packet {}", $$0, $$1);
      zr.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.k.a(alw.b.a).map(alw.a::c);
      if (this.h) {
         this.b.a(new wa(xe.c("disconnect.packetError"), $$2, $$3));
      }
   }

   @Override
   public wa a(xe $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.k.a(alw.b.a).map(alw.a::c);
      return new wa($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zl $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zo.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ad.f() + "-client.txt");
      Optional<alw.a> $$5 = this.k.a(alw.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zl<?> $$0) {
      return zr.super.a($$0) ? true : this.g && ($$0 instanceof aaa || $$0 instanceof aab);
   }

   @Override
   public void a(zv $$0) {
      this.a(new aah($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zw $$0) {
      zo.a($$0, this, this.a);
      this.b(new aai($$0.b()));
   }

   @Override
   public void a(zs $$0) {
      aao $$1 = $$0.b();
      if (!($$1 instanceof aap)) {
         zo.a($$0, this, this.a);
         if ($$1 instanceof aam $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aao var1);

   @Override
   public void a(zy $$0) {
      zo.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aaj($$1, aaj.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gca.a $$5 = this.c != null ? this.c.b() : gca.a.c;
         if ($$5 != gca.a.c && (!$$4 || $$5 != gca.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zx $$0) {
      zo.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xe a(xe $$0, @Nullable xe $$1) {
      return (xe)($$1 == null ? $$0 : xe.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(abv $$0) {
      zo.a($$0, this, this.a);
      this.b.a(new aby($$0.b(), this.i.get($$0.b())));
   }

   @Override
   public void a(aaa $$0) {
      zo.a($$0, this, this.a);
      this.i.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zt $$0) {
      zo.a($$0, this, this.a);
      this.j = $$0.b();
   }

   @Override
   public void a(zz $$0) {
      zo.a($$0, this, this.a);
      List<alw.c> $$1 = $$0.b();
      Builder<alw.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (alw.c $$3 : $$1) {
         try {
            URI $$4 = ad.a($$3.b());
            $$2.add(new alw.a($$3.a(), $$4));
         } catch (Exception var7) {
            m.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.k = new alw($$2.build());
   }

   @Override
   public void a(aab $$0) {
      this.g = true;
      zo.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xe.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gdd $$1 = new gdd($$0.b(), $$0.e());
         fpg.a(Objects.requireNonNullElseGet(this.f, fqj::new), this.a, $$1, this.c, false, new gce(this.i));
      }
   }

   @Override
   public void a(zu $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gbj.a> $$0 = this.n.iterator();

      while ($$0.hasNext()) {
         gbj.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ad.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zl<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wa $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      m.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.j.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.j.forEach($$2::a);
      }
   }

   protected fqh b(wa $$0) {
      fqh $$1 = Objects.requireNonNullElseGet(this.f, () -> new fsw(new fqj()));
      return (fqh)(this.c != null && this.c.e() ? new hdl($$1, l, $$0.a()) : new fpo($$1, l, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zl<? extends wq> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.n.add(new gbj.a($$0, $$1, ad.c() + $$2.toMillis()));
      }
   }

   private fqh a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xe $$4) {
      fqh $$5 = this.a.z;
      return $$5 instanceof gbj.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gbj.b(this.a, $$5, List.of(new gbj.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zl<? extends wq> a, BooleanSupplier b, long c) {
   }

   class b extends fpf {
      private final List<gbj.b.a> s;
      @Nullable
      private final fqh u;

      b(final fip $$0, @Nullable final fqh $$1, final List<gbj.b.a> $$2, final boolean $$3, @Nullable final xe $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hac $$6 = $$0.af();
               if ($$5) {
                  if (gbj.this.c != null) {
                     gbj.this.c.a(gca.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gbj.this.b.a(xe.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gbj.this.c != null) {
                     gbj.this.c.a(gca.a.b);
                  }
               }

               for (gbj.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gbj.this.c != null) {
                  gcb.b(gbj.this.c);
               }
            },
            $$3 ? xe.c("multiplayer.requiredTexturePrompt.line1") : xe.c("multiplayer.texturePrompt.line1"),
            gbj.a($$3 ? xe.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xe.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xd.i : xd.f,
            $$3 ? xd.p : xd.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gbj.b a(fip $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xe $$5) {
         List<gbj.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gbj.b.a($$1, $$2, $$3)).build();
         return gbj.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
