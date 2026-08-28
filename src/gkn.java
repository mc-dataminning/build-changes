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

public abstract class gkn implements zl {
   private static final wy k = wy.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final fpt a;
   protected final vr b;
   @Nullable
   protected final glf c;
   @Nullable
   protected String d;
   protected final hph e;
   @Nullable
   protected final fys f;
   protected boolean g;
   private final List<gkn.a> m = new ArrayList<>();
   protected final Map<alg, byte[]> h;
   protected Map<String, String> i;
   protected aly j;

   protected gkn(fpt $$0, vr $$1, gkv $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
      this.i = $$2.j();
      this.j = $$2.k();
   }

   @Override
   public void a(zf $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zl.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(aly.b.a).map(aly.a::c);
      this.b.a(new vt(wy.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public vt a(wy $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(aly.b.a).map(aly.a::c);
      return new vt($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zf $$0, Throwable $$1) {
      p $$2 = p.a($$1, "Packet handling error");
      zi.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ag.f() + "-client.txt");
      Optional<aly.a> $$5 = this.j.a(aly.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, z.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zf<?> $$0) {
      return zl.super.a($$0) ? true : this.g && ($$0 instanceof zu || $$0 instanceof zv);
   }

   @Override
   public void a(zp $$0) {
      this.a(new aab($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zq $$0) {
      zi.a($$0, this, this.a);
      this.b(new aac($$0.b()));
   }

   @Override
   public void a(zm $$0) {
      aai $$1 = $$0.b();
      if (!($$1 instanceof aaj)) {
         zi.a($$0, this, this.a);
         if ($$1 instanceof aag $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aai var1);

   @Override
   public void a(zs $$0) {
      zi.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aad($$1, aad.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         glf.a $$5 = this.c != null ? this.c.b() : glf.a.c;
         if ($$5 != glf.a.c && (!$$4 || $$5 != glf.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zr $$0) {
      zi.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static wy a(wy $$0, @Nullable wy $$1) {
      return (wy)($$1 == null ? $$0 : wy.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abp $$0) {
      zi.a($$0, this, this.a);
      this.b.a(new abs($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zu $$0) {
      zi.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zn $$0) {
      zi.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(zt $$0) {
      zi.a($$0, this, this.a);
      List<aly.c> $$1 = $$0.b();
      Builder<aly.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (aly.c $$3 : $$1) {
         try {
            URI $$4 = ag.a($$3.b());
            $$2.add(new aly.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new aly($$2.build());
   }

   @Override
   public void a(zv $$0) {
      this.g = true;
      zi.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(wy.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gmi $$1 = new gmi($$0.b(), $$0.e());
         fxr.a(Objects.requireNonNullElseGet(this.f, fyu::new), this.a, $$1, this.c, false, new glj(this.h));
      }
   }

   @Override
   public void a(zo $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gkn.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gkn.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ag.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zf<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vt $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      l.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Is Local", () -> String.valueOf(this.b.e()));
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         q $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected fys b(vt $$0) {
      fys $$1 = Objects.requireNonNullElseGet(this.f, () -> new gbk(new fyu()));
      return (fys)(this.c != null && this.c.e() ? new hqa($$1, k, $$0.a()) : new fxz($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zf<? extends wk> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gkn.a($$0, $$1, ag.c() + $$2.toMillis()));
      }
   }

   private fys a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wy $$4) {
      fys $$5 = this.a.z;
      return $$5 instanceof gkn.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gkn.b(this.a, $$5, List.of(new gkn.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zf<? extends wk> a, BooleanSupplier b, long c) {
   }

   class b extends fxq {
      private final List<gkn.b.a> s;
      @Nullable
      private final fys u;

      b(final fpt $$0, @Nullable final fys $$1, final List<gkn.b.a> $$2, final boolean $$3, @Nullable final wy $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hmq $$6 = $$0.af();
               if ($$5) {
                  if (gkn.this.c != null) {
                     gkn.this.c.a(glf.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gkn.this.b.a(wy.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gkn.this.c != null) {
                     gkn.this.c.a(glf.a.b);
                  }
               }

               for (gkn.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gkn.this.c != null) {
                  glg.b(gkn.this.c);
               }
            },
            $$3 ? wy.c("multiplayer.requiredTexturePrompt.line1") : wy.c("multiplayer.texturePrompt.line1"),
            gkn.a($$3 ? wy.c("multiplayer.requiredTexturePrompt.line2").a(o.o, o.r) : wy.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wx.i : wx.f,
            $$3 ? wx.p : wx.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gkn.b a(fpt $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wy $$5) {
         List<gkn.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gkn.b.a($$1, $$2, $$3)).build();
         return gkn.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
