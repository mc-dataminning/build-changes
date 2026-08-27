import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record tj(tk j, tk k) {
   public static final Codec<tj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(tk.a.fieldOf("chat").forGetter(tj::a), tk.a.fieldOf("narration").forGetter(tj::b)).apply($$0, tj::new)
   );
   public static final tk b = tk.a("chat.type.text");
   public static final aex<tj> c = a("chat");
   public static final aex<tj> d = a("say_command");
   public static final aex<tj> e = a("msg_command_incoming");
   public static final aex<tj> f = a("msg_command_outgoing");
   public static final aex<tj> g = a("team_msg_command_incoming");
   public static final aex<tj> h = a("team_msg_command_outgoing");
   public static final aex<tj> i = a("emote_command");

   private static aex<tj> a(String $$0) {
      return aex.a(je.aq, new aey($$0));
   }

   public static void a(nt<tj> $$0) {
      $$0.a(c, new tj(b, tk.a("chat.type.text.narrate")));
      $$0.a(d, new tj(tk.a("chat.type.announcement"), tk.a("chat.type.text.narrate")));
      $$0.a(e, new tj(tk.b("commands.message.display.incoming"), tk.a("chat.type.text.narrate")));
      $$0.a(f, new tj(tk.c("commands.message.display.outgoing"), tk.a("chat.type.text.narrate")));
      $$0.a(g, new tj(tk.d("chat.type.team.text"), tk.a("chat.type.text.narrate")));
      $$0.a(h, new tj(tk.d("chat.type.team.sent"), tk.a("chat.type.text.narrate")));
      $$0.a(i, new tj(tk.a("chat.type.emote"), tk.a("chat.type.emote")));
   }

   public static tj.a a(aex<tj> $$0, bis $$1) {
      return a($$0, $$1.dL().G_(), $$1.N_());
   }

   public static tj.a a(aex<tj> $$0, dt $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static tj.a a(aex<tj> $$0, hu $$1, tn $$2) {
      ht<tj> $$3 = $$1.d(je.aq);
      return $$3.e($$0).a($$2);
   }

   public tj.a a(tn $$0) {
      return new tj.a(this, $$0);
   }

   public tk a() {
      return this.j;
   }

   public tk b() {
      return this.k;
   }

   public static record a(tj a, tn b, @Nullable tn c) {
      a(tj $$0, tn $$1) {
         this($$0, $$1, null);
      }

      public tn a(tn $$0) {
         return this.a.a().a($$0, this);
      }

      public tn b(tn $$0) {
         return this.a.b().a($$0, this);
      }

      public tj.a c(tn $$0) {
         return new tj.a(this.a, this.b, $$0);
      }

      public tj.b a(hu $$0) {
         ht<tj> $$1 = $$0.d(je.aq);
         return new tj.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, tn b, @Nullable tn c) {
      public b(sq $$0) {
         this($$0.m(), $$0.l(), $$0.c(sq::l));
      }

      public void a(sq $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, sq::a);
      }

      public Optional<tj.a> a(hu $$0) {
         ht<tj> $$1 = $$0.d(je.aq);
         tj $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new tj.a($$0x, this.b, this.c));
      }
   }
}
