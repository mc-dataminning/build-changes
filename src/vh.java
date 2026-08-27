import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record vh(vm d, @Nullable vd e, vk f, @Nullable ur g, uv h) {
   public static final MapCodec<vh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               vm.a.fieldOf("link").forGetter(vh::j),
               vd.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               vk.a.forGetter(vh::l),
               ut.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               uv.a.optionalFieldOf("filter_mask", uv.c).forGetter(vh::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new vh($$0x, (vd)$$1.orElse(null), $$2, (ur)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static vh a(String $$0) {
      return a(i, $$0);
   }

   public static vh a(UUID $$0, String $$1) {
      vk $$2 = vk.a($$1);
      vm $$3 = vm.a($$0);
      return new vh($$3, null, $$2, null, uv.c);
   }

   public vh a(ur $$0) {
      ur $$1 = !$$0.equals(ur.b(this.b())) ? $$0 : null;
      return new vh(this.d, this.e, this.f, $$1, this.h);
   }

   public vh a() {
      return this.g != null ? new vh(this.d, this.e, this.f, null, this.h) : this;
   }

   public vh a(uv $$0) {
      return this.h.equals($$0) ? this : new vh(this.d, this.e, this.f, this.g, $$0);
   }

   public vh a(boolean $$0) {
      return this.a($$0 ? this.h : uv.c);
   }

   public static void a(ats.a $$0, vm $$1, vk $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(att $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public ur c() {
      return Objects.requireNonNullElseGet(this.g, () -> ur.b(this.b()));
   }

   public Instant d() {
      return this.f.b();
   }

   public long e() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.d().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.d().plus(c));
   }

   public UUID f() {
      return this.d.c();
   }

   public boolean g() {
      return this.f().equals(i);
   }

   public boolean h() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.h() && this.d.c().equals($$0);
   }

   public boolean i() {
      return this.h.b();
   }

   public vm j() {
      return this.d;
   }

   @Nullable
   public vd k() {
      return this.e;
   }

   public vk l() {
      return this.f;
   }

   @Nullable
   public ur m() {
      return this.g;
   }

   public uv n() {
      return this.h;
   }
}
